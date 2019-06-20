package it.eng.de4idsa;
import java.io.FileInputStream;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.fraunhofer.iais.eis.ArtifactResponseMessage;
import it.eng.de4idsa.datex2.D2LogicalModel;
import it.eng.de4idsa.datex2.PayloadPublication;
import it.eng.de4idsa.datex2.Situation;
import it.eng.de4idsa.datex2.SituationPublication;
import it.eng.de4idsa.datex2.SituationRecord;
public class ConsumerConnector {

	private static final Logger LOG = Logger.getLogger(ConsumerConnector.class);

	public ConsumerConnector() {}

	public static void main(String[] args) {

		try {
			LOG.debug("ConsumerConnector starting...");
			FileInputStream input = new FileInputStream("config.properties");
			// load a properties file
			Properties prop = new Properties();
			prop.load(input);

			Path targetDirectory=Paths.get(prop.getProperty("targetDirectory"));
			String dapsUrl=prop.getProperty("dapsUrl");
			String keyStoreName=prop.getProperty("keyStoreName");
			String keyStorePassword=prop.getProperty("keyStorePassword");
			String keystoreAliasName=prop.getProperty("keystoreAliasName");
			String connectorUUID=prop.getProperty("connectorUUID");

			DAPSInteraction dapsInteraction=new DAPSInteraction();
			String token=dapsInteraction.acquireToken(targetDirectory, dapsUrl, keyStoreName, keyStorePassword, keystoreAliasName, connectorUUID);
			LOG.debug("TOKEN="+token);

			MDMProviderConnector mdmProviderConnector=new MDMProviderConnector();
			String id=prop.getProperty("id");
			String issuerConnector=prop.getProperty("issuerConnector");
			String artifactId=prop.getProperty("artifactId");
			String modelVersion=prop.getProperty("modelVersion");
			ArtifactResponseMessage artifactResponseMessage = mdmProviderConnector.getArtifactResponseMessage(id, issuerConnector, token, artifactId, modelVersion);
			LOG.debug("ID RESPONSE="+artifactResponseMessage.getId());
			String data=mdmProviderConnector.getData(id, issuerConnector, token, artifactId, modelVersion);
			//LOG.debug("data="+data);
			// create JAXB context and instantiate marshaller
			JAXBContext context = JAXBContext.newInstance(PayloadPublication.class);
			//Marshaller m = context.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Unmarshaller um = context.createUnmarshaller();
			LOG.debug("handler="+um.getEventHandler().toString());
			um.setEventHandler(new ValidationEventHandler() {
				@Override
				public boolean handleEvent(ValidationEvent event) {
					// TODO Auto-generated method stub
					LOG.debug("event="+event.toString());
					return true;
				}
			});
			LOG.debug("handler2="+um.getEventHandler().toString());
			um.setSchema(null);	
			Source source = new StreamSource(new StringReader(data));		
			
			JAXBElement<D2LogicalModel> root = um.unmarshal (source, D2LogicalModel.class);
			D2LogicalModel d2LogicalModel = root.getValue();
			LOG.debug("payload public lang="+d2LogicalModel.getPayloadPublication().getLang());
			PayloadPublication payloadPublication=d2LogicalModel.getPayloadPublication();
			if (payloadPublication instanceof SituationPublication) {
				SituationPublication situationPublication=(SituationPublication) payloadPublication;
				for (Situation situation:situationPublication.getSituation()) {
					LOG.debug("situation id="+situation.getId());
					for (SituationRecord situationRecord: situation.getSituationRecord()) {
						LOG.debug("--validity start="+situationRecord.getValidity().getValidityTimeSpecification().getOverallStartTime());
						LOG.debug("--validity end="+situationRecord.getValidity().getValidityTimeSpecification().getOverallEndTime());
						if (situationRecord.getImpact()!=null) {
							LOG.debug("--impact constriction type="+situationRecord.getImpact().getTrafficConstrictionType());
							LOG.debug("--validity impactOnRoadLayout="+situationRecord.getImpact().getImpactExtension().getImpactExtended().getImpactOnRoadLayout());
							LOG.debug("--validity trackCrossSection="+situationRecord.getImpact().getImpactExtension().getImpactExtended().getTrackCrossSection());	
						}
					}
				}
			}
			//D2LogicalModel d2LogicalModel=(D2LogicalModel) um.unmarshal(new StringReader(data));
			//PayloadPublication payloadPublication = (PayloadPublication) um.unmarshal(new StringReader(data));
			//LOG.debug(payloadPublication.getPublicationCreator().getInternationalIdentifierExtension());
			//TODO
			/*
			 *  Decode the response message and send data to ActiveMQ queue. 
			 *  Define the Apache Camel route for making data available to a rest service to be consumed by the DE
			 */
			ActiveMQConnector activeMQConnector=new ActiveMQConnector();
			//activeMQConnector.sendMessage(topicName, artifactResponseMessage.get);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	private static void getNodeIfExist(Node element, Integer level) {
		NodeList nodeList=element.getChildNodes();
		if (nodeList.getLength()>0) {
			for (int i=0; i<nodeList.getLength(); i++) {
				Node node=nodeList.item(i);
				LOG.debug("level="+level+" i="+i+" child="+node.toString());
				getNodeIfExist(node, level+1);
			}
		}
		
	}
	
}

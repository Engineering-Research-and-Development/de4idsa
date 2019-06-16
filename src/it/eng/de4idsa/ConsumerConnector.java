package it.eng.de4idsa;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.fraunhofer.iais.eis.ArtifactResponseMessage;

public class ConsumerConnector {

    private static final Logger LOG = LoggerFactory.getLogger(ConsumerConnector.class);

	public ConsumerConnector() {}
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
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
			ArtifactResponseMessage artifactResponseMessage = mdmProviderConnector.getData(id, issuerConnector, token, artifactId, modelVersion);
			LOG.debug("ID RESPONSE="+artifactResponseMessage.getId());
			//TODO
			/*
			 *  Decode the response message and send data to ActiveMQ queue. 
			 *  Define the Apache Camel route for making data available to a rest service to be consumed by the DE
			 */
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

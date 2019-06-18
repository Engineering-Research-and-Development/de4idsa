package it.eng.de4idsa;
import java.io.IOException;
import java.net.URI;

import java.util.GregorianCalendar;

import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.fraunhofer.iais.eis.ArtifactRequestMessage;
import de.fraunhofer.iais.eis.ArtifactRequestMessageBuilder;
import de.fraunhofer.iais.eis.ArtifactResponseMessage;
import de.fraunhofer.iais.eis.TokenBuilder;
import de.fraunhofer.iais.eis.TokenFormat;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.OkHttpClient.Builder;

public class MDMProviderConnector {
    private static final Logger LOG = Logger.getLogger(MDMProviderConnector.class);

	public MDMProviderConnector() {
	}

	public ArtifactResponseMessage getArtifactResponseMessage(String id, String issuerConnector, String token, String artifactId, String modelVersion) {
		ArtifactRequestMessageBuilder requestBuilder;
		ObjectMapper objectMapper=new ObjectMapper();
		//MediaType JSON= MediaType.parse("application/json; charset=utf-8");
		MediaType MULTI = MediaType.parse("multipart/mixed; boundary=msgpart");
		HostnameVerifier hostnameVerifier = new HostnameVerifier() {


			@Override
			public boolean verify(String hostname, SSLSession session) {
				// TODO Auto-generated method stub
				//HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
				return true;//hv.verify("localhost", session);
			}
		};
		try {
			requestBuilder = new ArtifactRequestMessageBuilder(new URI(id));

			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			DatatypeFactory datatypeFactory;

			datatypeFactory = DatatypeFactory.newInstance();

			XMLGregorianCalendar now = 
					datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
			requestBuilder._issued_(now);
			requestBuilder._issuerConnector_(new URI(issuerConnector));
			TokenBuilder _authorizationToken_=new TokenBuilder();
			_authorizationToken_._tokenFormat_(TokenFormat.JWT);
			_authorizationToken_._tokenValue_(token);
			requestBuilder._authorizationToken_(_authorizationToken_.build());
			requestBuilder._requestedArtifact_(new URI(artifactId));
			requestBuilder._modelVersion_(modelVersion);
			String header="--msgpart\r\n" + 
					"Content-Type: application/json; charset=utf-8\r\n" + 
					"Content-Disposition: form-data; name=\"header\"\r\n\r\n";
			String footer="\r\n--msgpart--";
			ArtifactRequestMessage requestMessage=requestBuilder.build();
			LOG.debug("test="+requestMessage.toString());
			OkHttpClient client = new OkHttpClient();
			Builder builder=new Builder();
			builder.hostnameVerifier(hostnameVerifier);
			client=builder.build();
			String bodyMessage=header+objectMapper.writeValueAsString(requestMessage)+footer;
			LOG.debug("bodyMessage="+bodyMessage);
			RequestBody body = RequestBody.create(MULTI, bodyMessage);

			Request request = new Request.Builder()
					.url("https://mdm-connector.ids.isst.fraunhofer.de/data")
					.header("Content-Type", "multipart/mixed; boundary=msgpart")
					.post(body)
					.build();
			Response response = client.newCall(request).execute();


			LOG.debug("Response: " + response.toString());
			String responseBody=response.body().string();
			
			
			responseBody=responseBody.substring(responseBody.indexOf('{'),responseBody.lastIndexOf('}')+1);
			LOG.debug("Body: " + responseBody);
			LOG.debug("Message: " + response.message());

			//JSON from String to Object
			ArtifactResponseMessage artifactResponseMessage = objectMapper.readValue(responseBody, ArtifactResponseMessage.class);
			LOG.debug("getId="+artifactResponseMessage.getId());
			
			if (!response.isSuccessful())
				throw new IOException("Unexpected code " + response);
			return artifactResponseMessage;

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String getData(String id, String issuerConnector, String token, String artifactId, String modelVersion) {
		ArtifactRequestMessageBuilder requestBuilder;
		ObjectMapper objectMapper=new ObjectMapper();
		//MediaType JSON= MediaType.parse("application/json; charset=utf-8");
		MediaType MULTI = MediaType.parse("multipart/mixed; boundary=msgpart");
		HostnameVerifier hostnameVerifier = new HostnameVerifier() {


			@Override
			public boolean verify(String hostname, SSLSession session) {
				// TODO Auto-generated method stub
				//HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
				return true;//hv.verify("localhost", session);
			}
		};
		try {
			requestBuilder = new ArtifactRequestMessageBuilder(new URI(id));

			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			DatatypeFactory datatypeFactory;

			datatypeFactory = DatatypeFactory.newInstance();

			XMLGregorianCalendar now = 
					datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
			requestBuilder._issued_(now);
			requestBuilder._issuerConnector_(new URI(issuerConnector));
			TokenBuilder _authorizationToken_=new TokenBuilder();
			_authorizationToken_._tokenFormat_(TokenFormat.JWT);
			_authorizationToken_._tokenValue_(token);
			requestBuilder._authorizationToken_(_authorizationToken_.build());
			requestBuilder._requestedArtifact_(new URI(artifactId));
			requestBuilder._modelVersion_(modelVersion);
			String header="--msgpart\r\n" + 
					"Content-Type: application/json; charset=utf-8\r\n" + 
					"Content-Disposition: form-data; name=\"header\"\r\n\r\n";
			String footer="\r\n--msgpart--";
			ArtifactRequestMessage requestMessage=requestBuilder.build();
			LOG.debug("test="+requestMessage.toString());
			OkHttpClient client = new OkHttpClient();
			Builder builder=new Builder();
			builder.hostnameVerifier(hostnameVerifier);
			client=builder.build();
			String bodyMessage=header+objectMapper.writeValueAsString(requestMessage)+footer;
			LOG.debug("bodyMessage="+bodyMessage);
			RequestBody body = RequestBody.create(MULTI, bodyMessage);

			Request request = new Request.Builder()
					.url("https://mdm-connector.ids.isst.fraunhofer.de/data")
					.header("Content-Type", "multipart/mixed; boundary=msgpart")
					.post(body)
					.build();
			Response response = client.newCall(request).execute();


			LOG.debug("Response: " + response.toString());
			String responseBody=response.body().string();
			
			String data=extractXML(responseBody);
			/*
			 * data="<d2LogicalModel modelBaseVersion=\"2\" xmlns=\"http://datex2.eu/schema/2/2_0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://datex2.eu/schema/2/2_0 ..\\..\\Schema\\DATEXIISchema_2_2_0.xsd\">\r\n"
			 * + "	<exchange>\r\n" + "		<supplierIdentification>\r\n" +
			 * "			<country>se</country>\r\n" +
			 * "			<nationalIdentifier>SRA</nationalIdentifier>\r\n" +
			 * "		</supplierIdentification>\r\n" + "	</exchange>\r\n" +
			 * "	<payloadPublication xsi:type=\"SituationPublication\" lang=\"se\">\r\n"
			 * + "		<publicationTime>2006-09-28T16:00:00+01:00</publicationTime>\r\n" +
			 * "		<publicationCreator>\r\n" + "			<country>se</country>\r\n" +
			 * "			<nationalIdentifier>SRA</nationalIdentifier>\r\n" +
			 * "		</publicationCreator>\r\n" +
			 * "		<situation id=\"GUID2A22530C-D452-4ae8-B942-993BC2923D13\" version=\"1\">\r\n"
			 * + "			<overallSeverity>high</overallSeverity>\r\n" +
			 * "			<relatedSituation id=\"GUID3322530C-D452-4ae8-B942-993BC2923D13\" targetClass=\"Situation\" version=\"1\"/>\r\n"
			 * + "			<headerInformation>\r\n" +
			 * "				<confidentiality>noRestriction</confidentiality>\r\n" +
			 * "				<informationStatus>real</informationStatus>\r\n" +
			 * "				<urgency>normalUrgency</urgency>\r\n" +
			 * "			</headerInformation>\r\n" +
			 * "			<situationRecord xsi:type=\"Accident\" id=\"GUID2A22530C-D452-4ae8-B942-993BC2923D14\" version=\"1\">\r\n"
			 * +
			 * "				<situationRecordCreationTime>2006-09-28T16:00:00+01:00</situationRecordCreationTime>\r\n"
			 * +
			 * "				<situationRecordVersionTime>2006-09-28T16:05:00+00:00</situationRecordVersionTime>\r\n"
			 * +
			 * "				<situationRecordFirstSupplierVersionTime>2006-09-28T16:05:00+00:00</situationRecordFirstSupplierVersionTime>\r\n"
			 * +
			 * "				<probabilityOfOccurrence>certain</probabilityOfOccurrence>\r\n"
			 * + "				<severity>high</severity>\r\n" +
			 * "				<source>\r\n" +
			 * "					<sourceIdentification>SRA</sourceIdentification>\r\n" +
			 * "					<sourceName>\r\n" +
			 * "						<values>\r\n" +
			 * "							<value lang=\"se\">Vägverket</value>\r\n" +
			 * "							<value lang=\"en\">Swedish Road Administration</value>\r\n"
			 * + "						</values>\r\n" +
			 * "					</sourceName>\r\n" +
			 * "					<sourceType>roadAuthorities</sourceType>\r\n" +
			 * "				</source>\r\n" + "				<validity>\r\n" +
			 * "					<validityStatus>definedByValidityTimeSpec</validityStatus>\r\n"
			 * + "					<validityTimeSpecification>\r\n" +
			 * "						<overallStartTime>2006-10-17T14:00:00+02:00</overallStartTime>\r\n"
			 * +
			 * "						<overallEndTime>2006-10-17T16:00:00+02:00</overallEndTime>\r\n"
			 * + "					</validityTimeSpecification>\r\n" +
			 * "				</validity>\r\n" + "				<impact>\r\n" +
			 * "					<trafficConstrictionType>roadBlocked</trafficConstrictionType>\r\n"
			 * + "				</impact>\r\n" + "				<generalPublicComment>\r\n"
			 * + "					<comment>\r\n" + "						<values>\r\n" +
			 * "							<value lang=\"se\">Detta är en svensk olycka</value>\r\n"
			 * +
			 * "							<value lang=\"en\">This is a swedish accident</value>\r\n"
			 * + "						</values>\r\n" + "					</comment>\r\n"
			 * + "				</generalPublicComment>\r\n" +
			 * "				<groupOfLocations xsi:type=\"Linear\">\r\n" +
			 * "					<alertCLinear xsi:type=\"AlertCMethod4Linear\">\r\n" +
			 * "						<alertCLocationCountryCode>E</alertCLocationCountryCode>\r\n"
			 * +
			 * "						<alertCLocationTableNumber>33</alertCLocationTableNumber>\r\n"
			 * +
			 * "						<alertCLocationTableVersion>1</alertCLocationTableVersion>\r\n"
			 * + "						<alertCDirection>\r\n" +
			 * "							<alertCDirectionCoded>positive</alertCDirectionCoded>\r\n"
			 * + "						</alertCDirection>\r\n" +
			 * "						<alertCMethod4PrimaryPointLocation>\r\n" +
			 * "							<alertCLocation>\r\n" +
			 * "								<specificLocation>2030</specificLocation>\r\n"
			 * + "							</alertCLocation>\r\n" +
			 * "							<offsetDistance>\r\n" +
			 * "								<offsetDistance>10</offsetDistance>\r\n" +
			 * "							</offsetDistance>\r\n" +
			 * "						</alertCMethod4PrimaryPointLocation>\r\n" +
			 * "						<alertCMethod4SecondaryPointLocation>\r\n" +
			 * "							<alertCLocation>\r\n" +
			 * "								<specificLocation>2033</specificLocation>\r\n"
			 * + "							</alertCLocation>\r\n" +
			 * "							<offsetDistance>\r\n" +
			 * "								<offsetDistance>20</offsetDistance>\r\n" +
			 * "							</offsetDistance>\r\n" +
			 * "						</alertCMethod4SecondaryPointLocation>\r\n" +
			 * "					</alertCLinear>\r\n" +
			 * "				</groupOfLocations>\r\n" +
			 * "				<accidentType>accident</accidentType>\r\n" +
			 * "			</situationRecord>\r\n" + "		</situation>\r\n" +
			 * "	</payloadPublication>\r\n" + "</d2LogicalModel>\r\n" + "";
			 * //data=data.replace("type=\"SituationPublication\"", "");
			 */		
			//System.out.println("data="+data);
			return data;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private String extractXML(String text) {
		return text.substring(text.indexOf("<d2LogicalModel"),text.lastIndexOf("</S:Body>")-1);
	}
}

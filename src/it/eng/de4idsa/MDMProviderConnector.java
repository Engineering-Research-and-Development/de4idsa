package it.eng.de4idsa;
import java.io.IOException;
import java.net.URI;
import java.util.GregorianCalendar;

import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static final Logger LOG = LoggerFactory.getLogger(MDMProviderConnector.class);

	public MDMProviderConnector() {
	}

	public ArtifactResponseMessage getData(String id, String issuerConnector, String token, String artifactId, String modelVersion) {
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
}

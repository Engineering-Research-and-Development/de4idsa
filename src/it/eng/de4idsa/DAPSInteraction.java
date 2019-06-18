package it.eng.de4idsa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DAPSInteraction {
    private static final Logger LOG = Logger.getLogger(DAPSInteraction.class);

	public DAPSInteraction() {}

	/**
	 * Method to aquire a Dynamic Attribute Token (DAT) from a Dynamic Attribute Provisioning Service (DAPS)
	 *
	 * @param targetDirectory - The directory the keystore resides in
	 * @param dapsUrl - the token aquiry URL (e.g., http://daps.aisec.fraunhofer.de:8080, the suffix (/token.php) is added automatically
	 * @param keyStoreName - name of the keystore file (e.g., server-keystore.jks)
	 * @param keyStorePassword - password of keystore
	 * @param keystoreAliasName - alias of the connector's key entry. For default keystores with only one entry, this is '1'
	 * @param connectorUUID - The UUID used to register the connector at the DAPS. Should be replaced by working code that does this automatically
	 */
	public String acquireToken(Path targetDirectory, String dapsUrl, String keyStoreName, String keyStorePassword, String keystoreAliasName, String connectorUUID) {
		LOG.debug("Resolving path for keystore: " + keyStoreName);
		LOG.debug("Path to resolve: " + targetDirectory);
		String token="";
		try (InputStream jksInputStream = Files.newInputStream(targetDirectory.resolve(keyStoreName))) {
			KeyStore store = KeyStore.getInstance("JKS");
			store.load(jksInputStream, keyStorePassword.toCharArray());
			// get private key
			Key privKey = (PrivateKey) store.getKey(keystoreAliasName, keyStorePassword.toCharArray());
			// Get certificate of public key
			//X509Certificate cert = (X509Certificate)store.getCertificate(keystoreAliasName);
			//connecturUUID = TODO: Get X509 principal, get SubjectDN, parse Common Name
			Certificate cert = store.getCertificate(keystoreAliasName);
			// Get public key
			PublicKey publicKey = cert.getPublicKey();

			byte[] encodedPublicKey = publicKey.getEncoded();
			String b64PublicKey = Base64.getEncoder().encodeToString(encodedPublicKey);

			LOG.debug("*************Public Key*****************");
			LOG.debug(b64PublicKey);

			LOG.debug("Private key loaded. Retrieving Dynamic Attribute Token...");

			//create signed JWT (JWS)
			//Create expiry date one day (86400 seconds) from now
			Date expiryDate = Date.from(Instant.now().plusSeconds(86400));
			JwtBuilder jwtb = Jwts.builder()
					.setIssuer(connectorUUID)
					.setSubject(connectorUUID)
					.setExpiration(expiryDate)
					.setIssuedAt(Date.from(Instant.now()))
					.setAudience("https://api.localhost")
					.setNotBefore(Date.from(Instant.now()));

			String jws = jwtb.signWith( SignatureAlgorithm.RS256, privKey).compact();
			/** This is for the old DAPS
            LOG.info("Constructed JWS: " + jws);
            String json =
            "{\"grant_type\": \"urn:ietf:params:oauth:grant-type:jwt-bearer\","
              + "\"assertion\":\""
              + jws
              + "\"}";
			 */
			String json =
					"{\"\": \"\","
							+ "\"\":\"urn:ietf:params:oauth:client-assertion-type:jwt-bearer\","
							+ "\"\":\""
							+ jws + "\","
							+ "\"\":\"\","
							+ "}";



			LOG.debug("POSTing with JSON header " + json);
			OkHttpClient client = new OkHttpClient();
			RequestBody formBody = new FormBody.Builder()
					.add("grant_type", "client_credentials")
					.add("client_assertion_type", "urn:ietf:params:oauth:client-assertion-type:jwt-bearer")
					.add("client_assertion", jws)
					.add("scope", "ids_connector security_level")
					.build();
			Request request = new Request.Builder().url(dapsUrl).post(formBody).build();
			Response response = client.newCall(request).execute();

			String body=response.body().string();
			ObjectNode node = new ObjectMapper().readValue(body, ObjectNode.class);
			//          
			//actually, try and *reuse* a single instance of ObjectMapper
			
			if (node.has("access_token")) {
				token=node.get("access_token").asText();
				LOG.debug("access_token: " + token);
			}    
			LOG.debug("Response: " + response.toString());
			LOG.debug("Body: " + body);
			LOG.debug("Message: " + response.message());

			if (!response.isSuccessful())
				throw new IOException("Unexpected code " + response);


			return token;

		} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | IOException e) {
			LOG.debug("Cannot acquire token:"+e);
			e.printStackTrace();
		}
		//TODO: Get Token, return it
		return token;
	}
}

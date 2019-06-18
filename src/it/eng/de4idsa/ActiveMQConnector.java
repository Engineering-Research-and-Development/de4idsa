package it.eng.de4idsa;
import java.io.FileInputStream;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;



public class ActiveMQConnector {
	private static final Logger LOG = Logger.getLogger(ActiveMQConnector.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		try {

			LOG.debug("ActiveMQConnector starting...");
			FileInputStream input = new FileInputStream("config.properties");
			// load a properties file
			Properties prop = new Properties();
			prop.load(input);

			String activeMQUrl=prop.getProperty("activeMQUrl");
			// Producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					activeMQUrl);
			connection = connectionFactory.createConnection();
			Session session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			Topic topic = session.createTopic("customerTopic");     

			// Consumer1 subscribes to customerTopic
			MessageConsumer consumer1 = session.createConsumer(topic);
			consumer1.setMessageListener(new ConsumerMessageListener("Consumer1"));

			// Consumer2 subscribes to customerTopic
			MessageConsumer consumer2 = session.createConsumer(topic);
			consumer2.setMessageListener(new ConsumerMessageListener("Consumer2"));

			connection.start();     

			// Publish
			String payload = "Important Task";
			Message msg = session.createTextMessage(payload);
			MessageProducer producer = session.createProducer(topic);
			LOG.debug("Sending text '" + payload + "'");
			producer.send(msg);

			Thread.sleep(3000);
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean sendMessage(String topicName, String messagePayload) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {

			LOG.debug("ActiveMQConnector starting...");
			FileInputStream input = new FileInputStream("config.properties");
			// load a properties file
			Properties prop = new Properties();
			prop.load(input);

			String activeMQUrl=prop.getProperty("activeMQUrl");
			// Producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					activeMQUrl);
			connection = connectionFactory.createConnection();
			Session session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			Topic topic = session.createTopic(topicName);     

			// Consumer1 subscribes to customerTopic
			MessageConsumer consumer1 = session.createConsumer(topic);
			consumer1.setMessageListener(new ConsumerMessageListener("Consumer1"));

			// Consumer2 subscribes to customerTopic
			MessageConsumer consumer2 = session.createConsumer(topic);
			consumer2.setMessageListener(new ConsumerMessageListener("Consumer2"));

			connection.start();     

			// Publish
			Message msg = session.createTextMessage(messagePayload);
			MessageProducer producer = session.createProducer(topic);
			LOG.debug("Sending text '" + messagePayload + "'");
			producer.send(msg);

			
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return true;
	
	}

}

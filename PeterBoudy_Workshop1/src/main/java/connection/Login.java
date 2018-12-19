package connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Login {
private final static Logger LOG = LoggerFactory.getLogger(Login.class);

		private static String username = null;
		private static String password = null;
		private static String url = null;
		
		public static Connection createconnection(){
			
			    try {
				File xmlFile = new File("src/main/java/connection/LoginDetails.xml");
					if (xmlFile.exists()) {
						DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
						Document document = documentBuilder.parse(xmlFile);
						document.getDocumentElement().normalize();
						//Why do we use item(0), what would happen if we used item(1)? (By Peter)
						username = document.getElementsByTagName("username").item(0).getTextContent();
						password = document.getElementsByTagName("password").item(0).getTextContent();
						url = document.getElementsByTagName("url").item(0).getTextContent();
					} 
					else {
						LOG.info("xmlFile containing credentials not found");
						}
					}
			    //Which Exceptions do we need to catch? (by Peter) bijv. file doesnt exist?.
			    catch (Exception ex) {
				ex.printStackTrace();
			    }
		Connection connection = null;
    			try { 
    				connection = DriverManager.getConnection(url,username,password);
    				LOG.info("Succesfully connected to Database as: " + username);
    				}
    			catch (Exception ex) {
    				ex.printStackTrace();
    				}
return connection;
// Does this connection have to be closed()? (by Peter)
	}
}


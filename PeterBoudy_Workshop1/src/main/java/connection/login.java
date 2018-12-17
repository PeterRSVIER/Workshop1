package connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class login {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException{
		
final Logger LOG = LoggerFactory.getLogger(login.class);

		String username = null;
		String password = null;
		String url = null;
		
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
			    //Which Exceptions do we need to catch? (by Peter) bijv. bestand bestaat niet.
			    catch (Exception ex) {
				ex.printStackTrace();
			    }

	//LOG.info("Trying to login to database with: \n"
	//		+ "Username: "+ username + "\n"
	//		+ "Password " + password + "\n"
	//		+ "URL: " + url + "\n");

    try {
	Connection connection = DriverManager.getConnection(url,username,password);
    }
    catch (Exception ex) {
    ex.printStackTrace();
	}
	
    LOG.info("Succesfully connected to Database as: " + username);

	}
}


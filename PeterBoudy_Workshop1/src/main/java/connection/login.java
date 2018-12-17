package connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import utility.LogConfig;


public class login {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException{
		
		final Logger logger = LogConfig.getLogger();
//		Specify LogLevel for Class here, default = ALL
		LogConfig.setHandlerLevel(Level.ALL);
//
		
		String username = null;
		String password = null;
		String url = null;
		
			    try {
				File xmlFile = new File("src/main/java/connection/LoginDetails.xml");
				DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				Document document = documentBuilder.parse(xmlFile);
				document.getDocumentElement().normalize();
				//Why do we use item(0), what would happen if we used item(1)? (By Peter)
				username = document.getElementsByTagName("username").item(0).getTextContent();
				password = document.getElementsByTagName("password").item(0).getTextContent();
				url = document.getElementsByTagName("url").item(0).getTextContent();
			    } 
			    
			    //Which Exceptions do we need to catch? (by Peter)
			    catch (Exception ex) {
				ex.printStackTrace();
			    }
			    
				finally {
				    System.out.println("username:" + username);
				    System.out.println("password:" + password);
				}
    logger.entering("Trying to login to database with username:",username);//
    logger.entering("and password:", password);//
    logger.entering("url:",url);
    
	Connection connection = DriverManager.getConnection(url, username, password);

	logger.log(Level.INFO, "Succesfully connected to Database as: " + username);

	Statement statement = connection.createStatement();

	}
}


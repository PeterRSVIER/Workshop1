package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.*;
import utility.LogConfig;


public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException{
		
		final Logger logger = LogConfig.getLogger();
//		Specify LogLevel for Class here, default = ALL
		LogConfig.setHandlerLevel(Level.ALL);
//
		
	String 	ourHost = "jdbc:mysql://localhost/pb_workshop1", 
			ourUser = "root", 
			myPW = "rsvier";
	
    logger.entering("Trying to login to database with username:", ourUser);//
    logger.entering("and password", myPW);//
    
	Connection connection = DriverManager.getConnection(ourHost, ourUser, myPW);

	logger.log(Level.INFO, "Succesfully connected to Database as: " + ourUser);

	Statement statement = connection.createStatement();
	
	}
}


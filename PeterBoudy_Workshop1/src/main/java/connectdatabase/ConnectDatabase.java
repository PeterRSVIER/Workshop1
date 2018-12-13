package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;


public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException{
		
		final Logger logger = LogConfig.getLogger();
//		Specify LogLevel for Class here, default = ALL
		LogConfig.setHandlerLevel(Level.FINE);
//
		
	String 	ourHost = "jdbc:mysql://localhost/pb_workshop1", 
			ourUser = "root", 
			myPW = "rsvier";
	
	Connection connection = DriverManager.getConnection(ourHost, ourUser, myPW);
	Statement statement = connection.createStatement();

    logger.entering("Trying to login to database with username:", ourUser);//
    logger.entering("and password", myPW);//



	logger.log(Level.INFO, "Succesfully connected to Database as: " + ourUser);
}
}


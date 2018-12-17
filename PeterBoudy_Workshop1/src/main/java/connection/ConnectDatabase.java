package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.*;
import utility.LogConfig;
import java.io.File;

public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException, Exception {
		
		final Logger logger = LogConfig.getLogger();
//		Specify LogLevel for Class here, default = ALL
		LogConfig.setHandlerLevel(Level.ALL);
//
		
// File containing credentials is used as input to connect
		String  pwFileName = "pwFile.txt";
		String 	ourHost = "?";//"jdbc:mysql://localhost/pb_workshop1",
		String	ourUser = "?";//"root", 
		String 	myPW = "?";//"xxxxxx";

		File pwFile = new File(pwFileName);
		System.out.println(pwFile.getAbsolutePath());
		System.out.println(pwFile.getName());
        if (!pwFile.exists()) 
		  System.out.println("File " + pwFileName + " not found.");
        else { 
 		  Scanner input = new Scanner(pwFile);
 
          while (input.hasNext()){
		
		 	ourHost = input.next();
			ourUser = input.next(); 
		 	myPW    = input.next();
          }
          input.close();
 
        }

        
    logger.entering("Trying to login to database with username:", ourUser);//
    logger.entering("and password", myPW);//
    
	Connection connection = DriverManager.getConnection(ourHost, ourUser, myPW);

	logger.log(Level.INFO, "Succesfully connected to Database as: " + ourUser);

	Statement statement = connection.createStatement();
	
	}
}


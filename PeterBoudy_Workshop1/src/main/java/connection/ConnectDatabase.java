package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException, SQLException, Exception {
		

final Logger LOG = LoggerFactory.getLogger(ConnectDatabase.class);

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

        
    LOG.info("Trying to login to database with username:" + ourUser);//
    LOG.info("and password" + myPW);//
    
	Connection connection = DriverManager.getConnection(ourHost, ourUser, myPW);

	LOG.info("Succesfully connected to Database as: " + ourUser);

	Statement statement = connection.createStatement();
	
	}
}


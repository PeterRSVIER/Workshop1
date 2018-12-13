package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import customerinfo.CustomerTest;
import org.slf4j.*;//

public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException{

	    Logger logger = LoggerFactory.getLogger(ConnectDatabase.class);//
try {
	String ourHost = "jdbc:mysql://localhost/pb_workshop1", ourUser = "root", myPW = "rsvier";
	Connection connection = DriverManager.getConnection(ourHost, ourUser, myPW);
	Statement statement = connection.createStatement();

    logger.debug("Trying to login to database {} with username {} ...", ourHost, ourUser);//
    logger.debug("... and password {}", myPW);//
}

catch(SQLException ex) {
	System.out.println("Connection failed (Error by Peter)");
}
finally {//
  logger.info("End");//
}//
//System.out.println("End");
}
}

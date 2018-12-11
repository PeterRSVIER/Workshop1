package rsvier.workshop1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static void main(String[] args ) throws SQLException, ClassNotFoundException{
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {	

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1", "root", "rsvier");
	Statement statement = connection.createStatement();
	}
	catch (SQLException ex) {
		System.out.println(ex.toString());
	}
	System.out.println("Connection Succesfull");
}
}

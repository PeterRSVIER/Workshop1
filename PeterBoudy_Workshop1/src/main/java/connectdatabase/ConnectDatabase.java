package rsvier.workshop1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static void main(String[] args ) throws SQLException, ClassNotFoundException{


	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1", "root", "rsvier");
	Statement statement = connection.createStatement();
	System.out.println("Connection Succesfull");
}
}

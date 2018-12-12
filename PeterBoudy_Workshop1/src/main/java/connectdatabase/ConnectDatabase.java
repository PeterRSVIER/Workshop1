package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static void main(String[] args ) throws ClassNotFoundException{

try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1", "root", "rsvier");
	Statement statement = connection.createStatement();
}

catch(SQLException ex) {
	System.out.println("Connection failed (Error by Peter)");
}
System.out.println("End");
}
}

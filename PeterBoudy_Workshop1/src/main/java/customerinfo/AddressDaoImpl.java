package customerinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.Login;

public class AddressDaoImpl implements AddressDao {

	private static final Logger LOG = LoggerFactory.getLogger(AddressDaoImpl.class);

	public void createAddress(Address address) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO address (id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressTypeId)"
				+ " (VALUES ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
	    try {
		  PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
	      preparedStatement.setInt(1, address.getId());
		  preparedStatement.setInt(2, address.getCustomerId());
		  preparedStatement.setString(3, address.getZipCode());
		  preparedStatement.setInt(4, address.getHouseNumber());
          preparedStatement.setString(5, address.getHouseExtension());
          preparedStatement.setString(6, address.getStreet());
          preparedStatement.setString(7, address.getCity());
          preparedStatement.setString(8, address.getCountry());
          preparedStatement.setInt(9, address.getAddressTypeId());
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

/*	all fields are final, new address needed instead of update
     public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		String query = "UPDATE address set zipCode = ?, houseNumber = ?, houseExtension = ?, street = ?, city = ?, country = ?, addressType = ? WHERE id = ?)"; 
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1, address.getId());
		  preparedStatement.setInt(2, address.getCustomerId());
		  preparedStatement.setString(3, address.getZipCode());
		  preparedStatement.setInt(4, address.getHouseNumber());
          preparedStatement.setString(5, address.getHouseExtension()); 
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address successfully updated"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}
*/

	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub
		String query = "DELETE address where id = ?"; 
	    try {
		  PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
	      preparedStatement.setInt(1, address.getId());
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address successfully deleted"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	public void printAddresses() {
		  try {
				Statement statement = Login.createconnection().createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressTypeId from address");
				ResultSetMetaData metaData = resultSet.getMetaData();
				
				for (int i = 1; i <= metaData.getColumnCount(); i++){
					System.out.printf("%-12s\t", metaData.getColumnName(i));
				}	
				System.out.println();
				
				while (resultSet.next()) {
					for (int i = 1; i <= metaData.getColumnCount(); i++)
						System.out.printf("%-12s\t", resultSet.getObject(i));
					System.out.println();
				}
				statement.close();
		  } 
		  catch (SQLException e) { 
			  e.printStackTrace(); 
		  } 
		}

	public void printAddresses(String zipCode, int houseNumber) {
	  try {
          String query = "SELECT id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressTypeId FROM address where zipCode = ? and houseNumber = ?";
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			preparedStatement.setString(1, zipCode);
			preparedStatement.setInt(2, houseNumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			ResultSetMetaData metaData = resultSet.getMetaData();
			
			for (int i = 1; i <= metaData.getColumnCount(); i++){
				System.out.printf("%-12s\t", metaData.getColumnName(i));
			}	
			System.out.println();
			
			while (resultSet.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++)
					System.out.printf("%-12s\t", resultSet.getObject(i));
				System.out.println();
			}
			preparedStatement.close();
	  } 
	  catch (SQLException e) { 
		  e.printStackTrace(); 
	  } 
	}
	
	public void printAddresses(String zipCode, int houseNumber, String houseExtension) {
		  try {
	          String query = "SELECT id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressTypeId FROM address where zipCode = ? and houseNumber = ? and houseExtension = ?";
				PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
				preparedStatement.setString(1, zipCode);
				preparedStatement.setInt(2, houseNumber);
				preparedStatement.setString(3, houseExtension);
				ResultSet resultSet = preparedStatement.executeQuery();
				ResultSetMetaData metaData = resultSet.getMetaData();
				
				for (int i = 1; i <= metaData.getColumnCount(); i++){
					System.out.printf("%-12s\t", metaData.getColumnName(i));
				}	
				System.out.println();
				
				while (resultSet.next()) {
					for (int i = 1; i <= metaData.getColumnCount(); i++)
						System.out.printf("%-12s\t", resultSet.getObject(i));
					System.out.println();
				}
				preparedStatement.close();
		  } 
		  catch (SQLException e) { 
			  e.printStackTrace(); 
		  } 
		}

	public void printAddress(int id) {
				String query = "SELECT id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressTypeId FROM address where id = ?"; 
				try {
				PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
				  preparedStatement.setInt(1, id); 
				  ResultSet resultSet = preparedStatement.executeQuery();
				  
				  ResultSetMetaData metaData = resultSet.getMetaData();
					for (int i = 1; i <= metaData.getColumnCount(); i++){
						System.out.printf("%-20s\t", metaData.getColumnName(i));
					}	
					System.out.println();
					
					while (resultSet.next()) {
						for (int i = 1; i <= metaData.getColumnCount(); i++)
							System.out.printf("%-20s\t", resultSet.getObject(i));
						System.out.println();
				}
					preparedStatement.close();
				}
				catch (SQLException e) { 
					e.printStackTrace(); 
				} 
			}


}

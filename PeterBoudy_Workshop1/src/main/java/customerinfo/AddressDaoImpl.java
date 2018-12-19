package customerinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressDaoImpl implements AddressDao {

	private static final Logger LOG = LoggerFactory.getLogger(AddressDaoImpl.class);

	public void createAddressType(String addressType) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO addresstype (id, description) values (1, ?)";
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
          preparedStatement.setString(1, addressType);
		  preparedStatement.executeUpdate(); 
		  LOG.info("Addresstype successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

//nb: addresstype retrieved from table addresstype instead of address
	//in DB houseExtention (corrected locally)
	public void createAddress(Address address) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO address (id, customerId, zipCode, houseNumber, houseExtension, street, city, country, addressType)"
				+ " SELECT ?, ?, ?, ?, ?, ?, ?, ?, id FROM addresstype where addressType = ?"; 
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1, address.getId());
		  preparedStatement.setInt(2, address.getCustomerId());
		  preparedStatement.setString(3, address.getZipCode());
		  preparedStatement.setInt(4, address.getHouseNumber());
          preparedStatement.setString(5, address.getHouseExtension());
          preparedStatement.setString(6, address.getStreet());
          preparedStatement.setString(7, address.getCity());
          preparedStatement.setString(8, address.getCountry());
          preparedStatement.setString(9, address.getAddressType());
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
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1, address.getId());
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address successfully deleted"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	public void deleteAddressType(int id) {
		// TODO Auto-generated method stub
		String query = "DELETE addresstype where id = ?"; 
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1, id);
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address type successfully deleted"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	//method for addresses without extension, or to get all addresses on a housenumber
	//check addresstype
	public void getAddressByZipHN(String zipCode, int houseNumber) { 
		// TODO Auto-generated method stub
	  String query = "SELECT ads.id, customerId, zipCode, houseNumber, houseExtension, street, city, country, adt.type addressType FROM address ads, addresstype adt" + 
		             "WHERE ads.address_type_id = adt.id and ads.zipCode = ? and ads.houseNumber = ?)"; 
	  try {
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, zipCode);
		preparedStatement.setInt(2, houseNumber);
		preparedStatement.executeUpdate(); 
		LOG.info("Address successfully retrieved"); 
	  } 
	  catch (SQLException e) { 
		e.printStackTrace(); 
	  } 
	}

	//check addresstype
	public void getAddressByZipHNE(String zipCode, int houseNumber, String houseExtension) {
		// TODO Auto-generated method stub
	  String query = "SELECT ads.id, customerId, zipCode, houseNumber, houseExtension, street, city, country, adt.type addressType FROM address ads, addresstype adt" + 
		             "WHERE ads.address_type_id = adt.id and ads.zipCode = ? and ads.houseNumber = ? and ads.houseExtension = ?)"; 
	  try {
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, zipCode);
		preparedStatement.setInt(2, houseNumber);
	    preparedStatement.setString(3, houseExtension); 
		preparedStatement.executeUpdate(); 
		LOG.info("Address successfully retrieved"); 
	  } 
	  catch (SQLException e) { 
		e.printStackTrace(); 
	  } 
	}

//check addresstype
	public void getAddressById(int id) {
		// TODO Auto-generated method stub
		
		String query = "SELECT ads.id, customerId, zipCode, houseNumber, houseExtension, street, city, country, adt.type addressType FROM address ads, addresstype adt WHERE ads.address_type_id = adt.id and ads.id = ?"; 
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1?serverTimezone=Europe/Amsterdam","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1, id);
		  preparedStatement.executeUpdate(); 
		  LOG.info("Address successfully retrieved"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

}

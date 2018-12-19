package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.Login;

public class AccountTypeDaoImpl implements AccountTypeDao {
// in database table accounttype ipv accountType
// in database column id ipv accountType
	
	private static final Logger LOG = LoggerFactory.getLogger(AccountTypeDaoImpl.class);
	
	public void createAccountType(AccountType accountType) {
		String query = "INSERT INTO accountType (id, description) VALUES(?, ?)";
	    try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		         preparedStatement.setInt(1, accountType.getAccountType());  
		         preparedStatement.setString(2, accountType.getDescription());
		         preparedStatement.executeUpdate(); 
		         preparedStatement.close();
		         LOG.info("Accounttype: " + accountType.getDescription() + " successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	public void updateAccountType(AccountType accountType) {
		String query = "UPDATE accounttype SET description = ? WHERE id = ?"; 
		try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);; 
			  preparedStatement.setString(1, accountType.getDescription()); 
			  preparedStatement.setInt(2, accountType.getAccountType()); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("AccountTypeId: " + accountType.getAccountType() + "now has description: " + accountType.getDescription());
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void deleteAccountType(int id) {
		String query = "DELETE FROM accounttype WHERE id = ?"; 
		try {
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setInt(1, id); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("AccountId: " + id + " successfully removed");
			  } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void printAccountType() {
		  try {
				Statement statement = Login.createconnection().createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT id, description FROM accounttype");
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
	public void printAccountType(int id) {
				String query = "SELECT id, description FROM accounttype WHERE id = ?"; 
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

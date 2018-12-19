package user;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.Login;


public class AccountDaoImpl implements AccountDao{
	
private static final Logger LOG = LoggerFactory.getLogger(AccountDaoImpl.class);
	
// database = accountTypeId ipv. accountType
	public void createAccount(Account account) {
		String query = "INSERT INTO account (id, email, password, accountTypeId) VALUES( ?, ?, ?, ?)";
	    try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		         preparedStatement.setInt(1, account.getId()); 
		         preparedStatement.setString(2, account.getEmail());
		         preparedStatement.setString(3, account.getPassword()); 
		         preparedStatement.setInt(4, account.getAccountType()); 
		         preparedStatement.executeUpdate(); 
		         preparedStatement.close();
		         LOG.info("Account for: " + account.getEmail() + " successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}
	
	public void updateAccount(Account account, String email) {
		String query = "UPDATE account SET id = ?, email = ? , password = ? , accountTypeId = ? WHERE email = ?"; 
		try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setInt(1, account.getId()); 
			  preparedStatement.setString(2, account.getEmail()); 
			  preparedStatement.setString(3, account.getPassword());
			  preparedStatement.setInt(4, account.getAccountType());
			  preparedStatement.setString(5, email); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Account for: " + account.getEmail() + " has been updated to: " + email);
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void updateAccount(Account account, int id) {
		String query = "UPDATE account SET id = ?, email = ? , password = ? , accountTypeId = ? WHERE id = ?"; 
		try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setInt(1, account.getId()); 
			  preparedStatement.setString(2, account.getEmail()); 
			  preparedStatement.setString(3, account.getPassword());
			  preparedStatement.setInt(4, account.getAccountType());
			  preparedStatement.setInt(5, id); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Account with: " + account.getId() + " has been updated to accountId: " + id);
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	
	public void deleteAccount(String email) {
		String query = "DELETE FROM account WHERE email = ?"; 
		try {
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setString(1, email); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Account with email: " + email + " successfully removed");
			  } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void deleteAccount(int id) {
		String query = "DELETE FROM account WHERE id = ?"; 
		try {
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setInt(1, id); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Account with id: " + id + " successfully removed");
			  } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	
	public void printAccount(){
		  try {
				Statement statement = Login.createconnection().createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT id, accountTypeId, email FROM account");
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
	public void printAccount(String email) {
		String query = "SELECT id, accountTypeId, email FROM account WHERE email = ?"; 
		try {
		PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		  preparedStatement.setString(1, email); 
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

package store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import connection.Login;

public class ProductDaoImpl implements ProductDao {

private static final Logger LOG = LoggerFactory.getLogger(ProductDaoImpl.class);
	
// database = name ipv productname
	public void createProduct(Product product) {
		String query = "INSERT INTO product (name, id, price, stock) VALUES( ?, ?, ?, ?)"; 
	    try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		         preparedStatement.setString(1, product.getProductName()); 
		         preparedStatement.setInt(2, product.getId());
		         preparedStatement.setBigDecimal(3, product.getPrice()); 
		         preparedStatement.setInt(4, product.getStock()); 
		         preparedStatement.executeUpdate(); 
		         preparedStatement.close();
		         LOG.info("Product: " + product.getProductName() + " successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	public void updateProduct(Product product, int id) {
		String query = "UPDATE product SET name = ?, price = ? , stock = ? , id = ? WHERE id = ?"; 
		try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setString(1, product.getProductName()); 
			  preparedStatement.setBigDecimal(2, product.getPrice()); 
			  preparedStatement.setInt(3, product.getStock());
			  preparedStatement.setInt(4, product.getId());
			  preparedStatement.setInt(5, id); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("productid: " + id + " has been updated as: " + product.getProductName());
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void updateProduct(Product product, String name) {
		String query = "UPDATE product SET name = ?, price = ? , stock = ?, id = ? WHERE name = ?"; 
		try {
	    	PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setString(1, product.getProductName()); 
			  preparedStatement.setBigDecimal(2, product.getPrice()); 
			  preparedStatement.setInt(3, product.getStock()); 
			  preparedStatement.setInt(4, product.getId());
			  preparedStatement.setString(5, name);
			  preparedStatement.executeUpdate(); 
			  LOG.info("product: " + product.getProductName() + " has been updated to: " + name);
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	
	public void deleteProduct(int id) {
		String query = "DELETE FROM product WHERE id = ?"; 
		try {
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setInt(1, id); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Product with id: " + id + " successfully removed");
			  } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
	public void deleteProduct(String name) {
		String query = "DELETE FROM product WHERE name = ?"; 
		try {
			
			PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
			  preparedStatement.setString(1, name); 
			  preparedStatement.executeUpdate(); 
			  preparedStatement.close();
			  LOG.info("Product: " + name + " successfully removed");
			  } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}

	public void printProduct() {
	  try {
			Statement statement = Login.createconnection().createStatement();
			ResultSet resultSet = statement.executeQuery("select * from product");
			
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			for (int i = 1; i <= metaData.getColumnCount(); i++){
				System.out.printf("%-15s\t", metaData.getColumnName(i));
			}	
			System.out.println();
			
			while (resultSet.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++)
					System.out.printf("%-15s\t", resultSet.getObject(i));
				System.out.println();
			}
			statement.close();
	  } 
	  catch (SQLException e) { 
		  e.printStackTrace(); 
	  } 
	}
	public void printProduct(int id) {
		String query = "SELECT * from product WHERE id = ?"; 
		try {
		PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		  preparedStatement.setInt(1, id); 
		  ResultSet resultSet = preparedStatement.executeQuery();
		  
		  ResultSetMetaData metaData = resultSet.getMetaData();
			for (int i = 1; i <= metaData.getColumnCount(); i++){
				System.out.printf("%-15s\t", metaData.getColumnName(i));
			}	
			System.out.println();
			
			while (resultSet.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++)
					System.out.printf("%-15s\t", resultSet.getObject(i));
				System.out.println();
		}
			preparedStatement.close();
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 

	}
	public void printProduct(String name){
		String query = "SELECT * from product WHERE name = ?"; 
		try {
		PreparedStatement preparedStatement = Login.createconnection().prepareStatement(query);
		  preparedStatement.setString(1, name); 
		  ResultSet resultSet = preparedStatement.executeQuery();
		  
		  ResultSetMetaData metaData = resultSet.getMetaData();
			for (int i = 1; i <= metaData.getColumnCount(); i++){
				System.out.printf("%-15s\t", metaData.getColumnName(i));
			}	
			System.out.println();
			
			while (resultSet.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++)
					System.out.printf("%-15s\t", resultSet.getObject(i));
				System.out.println();
		}
			preparedStatement.close();
		}
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}
}

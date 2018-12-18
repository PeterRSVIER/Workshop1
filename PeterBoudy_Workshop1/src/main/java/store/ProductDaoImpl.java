package store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import connection.login;

public class ProductDaoImpl implements ProductDao {

private static final Logger LOG = LoggerFactory.getLogger(ProductDaoImpl.class);
	
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO product (name, id, price, stock) VALUES( ?, ?, ?, ?)"; 
	    try {
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/pb_workshop1","root","rsvier");
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
		         preparedStatement.setString(1, product.getProductName()); 
		         preparedStatement.setInt(2, product.getId());
		         preparedStatement.setBigDecimal(3, product.getPrice()); 
		         preparedStatement.setInt(4, product.getStock()); 
		         preparedStatement.executeUpdate(); 
		         LOG.info("Product successfully created"); 
	    } 
	    catch (SQLException e) { 
	    	e.printStackTrace(); 
		} 
	}

	public void updateProduct(List<Product> productList) {
		String query = "UPDATE product SET productname = ?, price = ? , stock = ? WHERE id = ?"; 
		try {
		  login.createconnection();
		  Statement statement = login.connection.createStatement();
		  PreparedStatement preparedStatement = login.connection.prepareStatement(query);
		  for (Product product : productList) { 
			  preparedStatement.setString(1, product.getProductName()); 
			  preparedStatement.setBigDecimal(2, product.getPrice()); 
			  preparedStatement.setInt(3, product.getStock()); 
			  preparedStatement.setInt(4, product.getId()); 
			  preparedStatement.executeUpdate(); 
			  } 
		  LOG.info("Product successfully updated"); 
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}

	public void deleteProduct(List<Product> productList) {
		String query = "DELETE product WHERE id = ?"; 
		try {
		  login.createconnection();
		  Statement statement = login.connection.createStatement();
		  PreparedStatement preparedStatement = login.connection.prepareStatement(query);
		  for (Product product : productList) { 
			  preparedStatement.setInt(1, product.getId()); 
			  preparedStatement.executeUpdate(); 
			  } 
		  LOG.info("Product successfully removed"); 
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}

	public void getProductByProductName(String productName) {
	  String query = "SELECT id, productname, date, stock from product WHERE productname = ?"; 
	  try {
		login.createconnection();
		Statement statement = login.connection.createStatement();
		PreparedStatement preparedStatement = login.connection.prepareStatement(query);
	    preparedStatement.setString(1, productName); 
	    preparedStatement.executeUpdate(); 
	    LOG.info("Products successfully retrieved"); 
	  } 
	  catch (SQLException e) { 
		  e.printStackTrace(); 
	  } 
	}

	public void getProductById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT id, productname, date, stock from product WHERE id = ?"; 
		try {
		  login.createconnection();
		  Statement statement = login.connection.createStatement();
		  PreparedStatement preparedStatement = login.connection.prepareStatement(query);
		  preparedStatement.setInt(1, id); 
		  preparedStatement.executeUpdate(); 
		  LOG.info("Product successfully retrieved"); 
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	}

}

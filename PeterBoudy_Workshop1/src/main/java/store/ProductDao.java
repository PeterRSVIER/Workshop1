package store;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao {

  public void createProduct(List<Product> productList) {
	String query = "INSERT INTO product (id, productname, price, stock) VALUES( ?, ?, ?, ?)"; 
    try {
	  ConnectDatabase conn = new ConnectDatabase(); 
  	  PreparedStatement preparedStatement = conn.prepareStatement(query);
      for (Product product : productList) { 
	         preparedStatement.setInt(1, product.getId());
	         preparedStatement.setString(2, product.getProductName()); 
	         preparedStatement.setBigDecimal(3, product.getPrice()); 
	         preparedStatement.setInt(4, product.getStock()); 
	         preparedStatement.executeUpdate(); 
	  } 
    logger.log(Level.INFO, "Product successfully created"); 
    } 
    catch (SQLException e) { 
	  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	} 
  }
  
 public void updateProduct(List<Product> productList) { 
	String query = "UPDATE product SET productname = ?, price = ? , stock = ? WHERE id = ?"; 
	try {
	  ConnectDatabase conn = new ConnectDatabase(); 
	  PreparedStatement preparedStatement = conn.prepareStatement(query);
	  for (Product product : productList) { 
		  preparedStatement.setString(1, product.getProductName()); 
		  preparedStatement.setBigDecimal(2, product.getPrice()); 
		  preparedStatement.setInt(3, product.getStock()); 
		  preparedStatement.setInt(4, product.getId()); 
		  preparedStatement.executeUpdate(); 
		  } 
	  logger.log(Level.INFO, "Product successfully updated"); 
	} 
	catch (SQLException e) { 
	  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	} 
  }

  public void deleteProduct(List<Product> productList) {
	String query = "DELETE product WHERE id = ?"; 
	try {
	  ConnectDatabase conn = new ConnectDatabase(); 
	  PreparedStatement preparedStatement = conn.prepareStatement(query);
	  for (Product product : productList) { 
		  preparedStatement.setInt(1, product.getId()); 
		  preparedStatement.executeUpdate(); 
		  } 
	  logger.log(Level.INFO, "Product successfully removed"); 
	} 
	catch (SQLException e) { 
	  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	} 
  }
	
  public Product<List> getProductByProductName(String productName) {
	String query = "SELECT id, productname, date, stock from product WHERE productname = ?"; 
	try {
	  ConnectDatabase conn = new ConnectDatabase(); 
	  PreparedStatement preparedStatement = conn.prepareStatement(query);
	  preparedStatement.setString(1, productName); 
	  preparedStatement.executeUpdate(); 
	  logger.log(Level.INFO, "Products successfully retrieved"); 
	} 
	catch (SQLException e) { 
	  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	} 
  }
	
  public Product getProductById(int id) {
	String query = "SELECT id, productname, date, stock from product WHERE id = ?"; 
	try {
	  ConnectDatabase conn = new ConnectDatabase(); 
	  PreparedStatement preparedStatement = conn.prepareStatement(query);
	  preparedStatement.setInt(1, id); 
	  preparedStatement.executeUpdate(); 
	  logger.log(Level.INFO, "Product successfully retrieved"); 
	} 
	catch (SQLException e) { 
	  logger.log(Level.WARNING, "SQL exception ocurred.", e); 
	} 
}		

//  public List<Account> getAllAccounts();

}

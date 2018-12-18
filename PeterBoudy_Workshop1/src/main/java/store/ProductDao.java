package store;

import java.util.List;

public interface ProductDao {

  public void createProduct(List<Product> productList);
  
 public void updateProduct(List<Product> productList);

  public void deleteProduct(List<Product> productList);
	
  public void getProductByProductName(String productName);
	
  public void getProductById(int id);		

//  public List<Account> getAllAccounts();

}

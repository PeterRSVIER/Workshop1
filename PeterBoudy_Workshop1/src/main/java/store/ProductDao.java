package store;

public interface ProductDao {

  public void createProduct();
  
 public void updateProduct();

  public void deleteProduct();
	
  public void getProductByProductName();
	
  public void getProductById();		

//  public List<Account> getAllAccounts();

}

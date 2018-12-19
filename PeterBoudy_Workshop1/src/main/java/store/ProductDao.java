package store;

import java.util.List;

public interface ProductDao {

public void createProduct(Product product);
  
public void updateProduct(Product product);

public void deleteProduct(int id);
	
public void printProduct();
public void printProduct(int id);		
public void printProduct(String name);
}

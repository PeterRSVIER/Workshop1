package store;

import java.util.List;

public interface ProductDao {

public void createProduct(Product product);
  
public void updateProduct(Product product, int id);
public void updateProduct (Product product, String name);

public void deleteProduct(int id);
public void deleteProduct(String name);
	
public void printProduct();
public void printProduct(int id);		
public void printProduct(String name);
}

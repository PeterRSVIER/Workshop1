package customerinfo;

public interface CustomerDao {

	  public void createCustomer(Customer customer);
	  
	  public void updateCustomer(Customer customer);

	   public void deleteCustomer(Customer customer);
	 	
//	   public void getCustomerBySurname(String surname);
	 	
	   public void printCustomers();	
	   
	   public void printCustomer(int id);
	   
	   public void printCustomers(String surname);

}

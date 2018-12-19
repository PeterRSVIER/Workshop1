package customerinfo;

public interface AddressDao {

	
	public void createAddress(Address address);
	  
//	  public void updateAddress(Address address); all fields are final, new address needed instead of update

	   public void deleteAddress(Address address);
	   
	   public void printAddresses();
	   
	   public void printAddresses(String zipCode, int houseNumber);
	   
	   public void printAddresses(String zipCode, int houseNumber, String houseExtension);
	   
	   public void printAddress(int id);
}

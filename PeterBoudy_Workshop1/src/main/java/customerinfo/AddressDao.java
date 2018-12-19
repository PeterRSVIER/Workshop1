package customerinfo;

public interface AddressDao {

	public void createAddressType(String addressType);
	
	public void createAddress(Address address);
	  
//	  public void updateAddress(Address address); all fields are final, new address needed instead of update

	   public void deleteAddress(Address address);
	   
	   public void deleteAddressType(int id);
	 	
//to get an address without house extension, or all addresses on that housennumber
	   public void getAddressByZipHN(String zipCode, int houseNumber);

	   public void getAddressByZipHNE(String zipCode, int houseNumber, String houseExtension);
	 	
	   public void getAddressById(int id);		

}

package customerinfo;

public class CustomerTest {

	public static void main(String[] args) {

    	String 	firstname = "Boudewijn", 
				middlename = "van", 
				lastname = "Beckhoven";
		
        Customer bobe = new Customer.Builder()
    		  .firstname(firstname)
    		  .middlename(middlename)
    		  .surname(lastname)
    		  .id(1)
    		  .accountId(1)
    		  .build();
        
        CustomerDaoImpl bobe_cdi = new CustomerDaoImpl();
        bobe_cdi.createCustomer(bobe);
        
        Customer pegr = new Customer.Builder()
	           .firstname(firstname)
	           .middlename(middlename)
	           .surname(lastname)
	           .id(2)
	           .accountId(2)
	           .build();

        CustomerDaoImpl pegr_cdi = new CustomerDaoImpl();
        bobe_cdi.createCustomer(pegr);

	}

}

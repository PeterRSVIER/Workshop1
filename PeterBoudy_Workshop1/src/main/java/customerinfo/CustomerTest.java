package customerinfo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomerTest {

	public static void main(String[] args) {

		
final Logger LOG = LoggerFactory.getLogger(CustomerTest.class);

		String 	firstname = "Boudewijn", 
				middlename = "van", 
				lastname = "Beckhoven";
		
        Customer bobe = new Customer.Builder()
    		  .firstname(firstname)
    		  .middlename(middlename)
    		  .surname(lastname)
    		  .id(1)
    		  .build();
        

        LOG.info("firstname set to: " + firstname);
        LOG.info("middlename set to: "+ middlename);
        LOG.info("lastname set to: " + lastname);//

        Customer pegr = new Customer.Builder()
	           .firstname(firstname)
	           .middlename(middlename)
	           .surname(lastname)
	           .id(2)
	           .build();
        LOG.info("Customers successfully created:" + firstname + middlename + lastname);
	}

}

package customerinfo;

import org.slf4j.*;//

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "Boudewijn", middlename = "van", lastname = "Beckhoven";
        Logger logger = LoggerFactory.getLogger(CustomerTest.class);//
        logger.debug("firstname set to {}, middlename set to {}", firstname, middlename);//
        logger.debug("lastname set to {}", lastname);//

        Customer bobe = new Customer.Builder()
    		  .firstname(firstname)
    		  .middlename(middlename)
    		  .surname(lastname)
    		  .customerId(1)
    		  .build();
		firstname = "Peter";
		middlename = "de";
		lastname = "Graaf";
		
        logger.debug("firstname set to {}, middlename set to {}", firstname, middlename);//
        logger.debug("lastname set to {}", lastname);//
		
        Customer pegr = new Customer.Builder()
	           .firstname(firstname)
	           .middlename(middlename)
	           .surname(lastname)
	           .customerId(2)
	           .build();
//		System.out.println("Customer data bobe: " + bobe + "\nCustomer data pege: " + pegr);
        logger.info("2 customers successfully created: bobe and pegr");//
	}

}

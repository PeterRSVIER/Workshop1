package customerinfo;

import java.util.logging.*;
import utility.LogConfig;


public class CustomerTest {

	public static void main(String[] args) {
		final Logger logger = LogConfig.getLogger();
		
//		Specify LogLevel for Class here, default = ALL
		utility.LogConfig.setHandlerLevel(Level.FINE);
//

		String 	firstname = "Boudewijn", 
				middlename = "van", 
				lastname = "Beckhoven";
		
        Customer bobe = new Customer.Builder()
    		  .firstname(firstname)
    		  .middlename(middlename)
    		  .surname(lastname)
    		  .id(1)
    		  .build();
        

        logger.log(Level.INFO, "firstname set to: {0}", firstname);
        logger.log(Level.INFO, "middlename set to: {0}", middlename);
        logger.log(Level.INFO, "lastname set to: {0}", lastname);//

        Customer pegr = new Customer.Builder()
	           .firstname(firstname)
	           .middlename(middlename)
	           .surname(lastname)
	           .id(2)
	           .build();
        logger.log(Level.INFO, "Customers successfully created: {0}", firstname + " " + middlename + " " + lastname);//
	}

}

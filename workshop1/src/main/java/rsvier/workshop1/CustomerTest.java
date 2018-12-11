package rsvier.workshop1;

import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer bobe = new Customer.Builder()
    		  .firstname("Boudewijn")
    		  .middlename("van")
    		  .surname("Beckhoven")
    		  .customerId(1)
    		  .build()
      ,        pegr = new Customer.Builder()
	           .firstname("Peter")
	           .middlename("de")
	           .surname("Graaf")
	           .customerId(2)
	           .build();

      System.out.println("Customer data bobe: " + bobe + "\nCustomer data pege: " + pegr);
      ArrayList<Customer> bobe_exists = new ArrayList<Customer>();
//      bobe_exists = searchCustomer("Beckhoven");
      System.out.println(bobe_exists);
	}

}

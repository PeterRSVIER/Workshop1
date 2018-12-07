package rsvier.workshop1;

import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer bobe = new Customer.Builder()
    		  .firstname("Boudewijn")
    		  .middlename("van")
    		  .surname("Beckhoven")
    		  .phoneNumber("0610377347")
    		  .email("boudy_beck@hotmail.com")
    		  .customerId(1)
    		  .residenceAddress(0)
    		  .billingAddress(0)
    		  .deliveryAddress(0)
    		  .build()
      ,        pegr = new Customer.Builder()
	           .firstname("Peter")
	           .middlename("de")
	           .surname("Graaf")
	           .phoneNumber("0610525311")
	           .email("peterdegraaf1991@hotmail.com")
	           .customerId(2)
	           .residenceAddress(0)
	           .billingAddress(0)
	           .deliveryAddress(0)
	           .build();

      System.out.println("Customer data bobe: " + bobe + "\nCustomer data pege: " + pegr);
      ArrayList<Customer> bobe_exists = new ArrayList<Customer>();
//      bobe_exists = searchCustomer("Beckhoven");
      System.out.println(bobe_exists);
	}

}

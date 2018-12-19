package customerinfo;

public class CustomerTest {

	public static void main(String[] args) {

//create generic customer to print all customers, hash code used to identify customer?
//auto-increment works but causes asynchronization java vs mySQLdb		
		Customer customer = new Customer();
		int hc = customer.hashCode();
		System.out.println(hc);
		CustomerDaoImpl customer_di = new CustomerDaoImpl();
		
    	String 	firstName = "Boudewijn", 
				middleName = "van", 
				surName = "Beckhoven";
		
        Customer bobe = new Customer.Builder()
    		  .firstName(firstName)
    		  .middleName(middleName)
    		  .surName(surName)
    		  .id(1)
    		  .accountId(1)
    		  .build();

		hc = bobe.hashCode();
		System.out.println(hc);

        CustomerDaoImpl bobe_di = new CustomerDaoImpl();
        bobe_di.createCustomer(bobe);
//        bobe_di.printCustomer(1);

        firstName = "Peter";
        middleName = "de";
        surName = "Graaf";

    	Customer pegr = new Customer.Builder()
	           .firstName(firstName)
	           .middleName(middleName)
	           .surName(surName)
	           .id(2)
	           .accountId(2)
	           .build();

    	hc = pegr.hashCode();
		System.out.println(hc);

        CustomerDaoImpl pegr_di = new CustomerDaoImpl();
        pegr_di.createCustomer(pegr);
//        pegr_di.printCustomers();
//        pegr_di.updateCustomer(pegr); geen identificatie

        System.out.println("All customers");
        customer_di.printCustomers();
        System.out.println("Customer id 1:");
        customer_di.printCustomer(1);
        System.out.println("Customer id 2:");
		customer_di.printCustomer(2);
        System.out.println("Customer Beckhoven");
		customer_di.printCustomers("Beckhoven");
        System.out.println("Customer Graaf");
		customer_di.printCustomers("Graaf");
		
		bobe_di.deleteCustomer(bobe);
		pegr_di.deleteCustomer(pegr);

	}

}

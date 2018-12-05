package rsvier.workshop1;

import java.util.*;

public class EmployeeMenu {

   public EmployeeMenu() {
	System.out.println("1 = Customers");
	System.out.println("2 = Orders");
	System.out.println("3 = Product catalog");
	System.out.println("9 = Logout");

	Scanner input = new Scanner(System.in);
    
    int inputOption = input.nextInt();
	switch (inputOption) {
	case 1 : CustomerMenu customer = new CustomerMenu();
//	case 2 : OrderMenu order = new OrderMenu();
	case 9 : EmployeeMenu employee = new EmployeeMenu();
	default : System.out.println("Please choose 1,2,3 or 9");
	
	}
	
   }
}
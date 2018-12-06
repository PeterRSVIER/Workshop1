package rsvier.workshop1;

import java.util.*;

public class EmployeeMenu {

   public EmployeeMenu() {
	System.out.println("Employee Menu \n"
			+ "1 = Customers \n"
			+ "2 = Orders \n"
			+ "3 = Product catalog \n"
			+ "9 = Logout");

	Scanner input = new Scanner(System.in);
    
    int inputOption = input.nextInt();
	switch (inputOption) {
	case 1 : new CustomerMenu(); break;
	case 2 : new OrderMenu(); break;
	case 3 : new ProductCatalog(); break;
	case 9 : new EmployeeMenu(); break;
	default : System.out.println("Please choose 1,2,3 or 9"); break;
	}
	input.close();
   }
}
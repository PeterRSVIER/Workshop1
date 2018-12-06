package rsvier.workshop1;

import java.util.Scanner;

public class CustomerMenu {

	

	public CustomerMenu() {
		    System.out.println("Customer menu \n "
		    		+ "1 = View \n"
		    		+ "2 = Add \n "
		    		+ "9 = Back");

		    Scanner input = new Scanner(System.in);
		    int inputCustomerMenu = input.nextInt();
			switch (inputCustomerMenu) {
			case 1 : new CustomerView(); break;
			case 2 : System.out.println("This function is still under construction");new CustomerMenu();break;
			case 9 : new EmployeeMenu(); break;//needs improvement
			default : System.out.println("Please choose 1,2 or 9"); break;
	        }
            input.close();
	}

}
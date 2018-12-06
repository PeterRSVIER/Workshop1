package rsvier.workshop1;

import java.util.Scanner;

public class CustomerView {

	   public CustomerView() {
		    System.out.println("Customer view \n "
		    		+ "1 = View \n"
		    		+ "2 = Modify \n "
		    		+ "3 = Delete \n"
		    		+ "9 = Back");
	   
			Scanner input = new Scanner(System.in);
	        int inputCustomerView = input.nextInt();
		    switch (inputCustomerView) {
		    case 1 : System.out.println("This function is still under construction");new CustomerMenu();break;
		    case 2 : System.out.println("This function is still under construction");new CustomerMenu();break;
		    case 3 : System.out.println("This function is still under construction");new CustomerMenu();break;
		    case 9 : new CustomerMenu(); break;//needs improvement
		    default : System.out.println("Please choose 1,2, 3 or 9");break;
		    }
		    input.close();
       }
}

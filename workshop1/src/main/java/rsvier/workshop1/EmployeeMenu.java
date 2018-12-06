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
	case 1 : CustomerMenu customer = new CustomerMenu(); break;
	case 2 : OrderMenu orderMenu = new OrderMenu();
	case 9 : EmployeeMenu employee = new EmployeeMenu(); break;
	default : System.out.println("Please choose 1,2,3 or 9"); break;}
   }
	public void Menu2(){
	System.out.println("menu2");
	}

   
}
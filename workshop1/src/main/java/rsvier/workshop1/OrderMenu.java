package rsvier.workshop1;

import java.util.Scanner;

public class OrderMenu {

	   public OrderMenu() {
			System.out.println("Order Menu \n"
					+ "Choose one of the following navigation options \n\n"
					+ "1 = View open orders\n"
					+ "2 = View order archive \n"
					+ "3 = Add order \n"
					+ "9 = Back");

			Scanner input = new Scanner(System.in);
		    
		    int inputOrderOption = input.nextInt();
			switch (inputOrderOption) {
			case 1 :  	System.out.print("\n\n\n\n\n\n\n\n\n\n");
						OpenOrders openOrders = new OpenOrders();
						break;
						
			case 2 : 	System.out.print("\n\n\n\n\n\n\n\n\n\n");
						OrderArchive orderArchive = new OrderArchive();
						break;
						
			case 9 :  	System.out.print("\n\n\n\n\n\n\n\n\n\n");
						EmployeeMenu employeeMenu = new EmployeeMenu(); 
						break;
						
			default : 	System.out.println("Please choose 1,2,3 or 9"); 
						break;
			
			}
			
		   }
		}
	

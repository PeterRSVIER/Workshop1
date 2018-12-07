package rsvier.workshop1;

import java.util.Scanner;

public class OpenOrders {

	   public OpenOrders() {
			System.out.println("List of open orders:\n"
								+ "1. <naam order 1> \n"
								+ "2. <naam order 2> \n"
								+ "3. <naam order 3> \n"
								+ "9. Back ");
			
			Scanner input = new Scanner(System.in);
		    
		    int inputOpenOrders = input.nextInt();
			switch (inputOpenOrders) {
			case 1 : 	System.out.print("\n\n\n\n\n\n\n\n\n\n"
										+ "Deze order is geplaatst op: <datum> \n"
										+ "en geplaast door: <naam> \n"
										+ "en bestaat uit de volgende kazen \n\n"
										+ "5x: Geitenkaas \n"
										+ "10x: Oudekazen \n\n");
						int inputOpenOrders2 = 0;
										do {
											System.out.println(
													"Return to Open Orders? \n"
													+ "0 = No \n"
													+ "1= Yes");
											inputOpenOrders2 = input.nextInt();
										}
										while ((int)inputOpenOrders2 != 1);
										
										new OpenOrders();
										break;
			case 9 :  	System.out.print("\n\n\n\n\n\n\n\n\n\n");
						new OrderMenu(); 
						break;
						
			default : 	System.out.println("Please choose 1 or 9"); 
						break;
}
}
}

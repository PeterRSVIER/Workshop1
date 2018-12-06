package rsvier.workshop1;

import java.util.Scanner;

public class OpenOrders {

	   public OpenOrders() {
			System.out.println("List of open orders:\n"
								+ "1. <naam order 1> \n"
								+ "2. <naam order 2> \n"
								+ "3. <naam order 3> \n"
								+ "4. <naam order 4> \n"
								+ "5. <naam order 5> \n"
								+ "6. <naam order 6> \n"
								+ "9. Back ");
			
			Scanner input = new Scanner(System.in);
		    
		    int inputOpenOrders = input.nextInt();
			switch (inputOpenOrders) {
			case 1 :  	System.out.print("\n\n\n\n\n\n\n\n\n\n"
										+ "Deze order is geplaatst op: <datum> \n"
										+ "en geplaast door: <naam> \n"
										+ "en bestaat uit de volgende kazen \n\n"
										+ "5x: Geitenkaas \n"
										+ "10x: Oudekazen \n");
										break;
			
			case 9 :  	System.out.print("\n\n\n\n\n\n\n\n\n\n");
						OrderMenu orderMenu = new OrderMenu(); 
						break;
						
			default : 	System.out.println("Please choose 1 or 9"); 
						break;
}
}
}

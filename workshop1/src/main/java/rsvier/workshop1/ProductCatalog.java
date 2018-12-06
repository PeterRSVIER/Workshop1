package rsvier.workshop1;

import java.util.Scanner;

public class ProductCatalog {



	public ProductCatalog() {

		System.out.println("Product catalog \n "
		    		+ "1 = View \n"
		    		+ "2 = Add \n "
		    		+ "9 = Back");
		    Scanner input = new Scanner(System.in);
		    int inputProductCatalog = input.nextInt();
			switch (inputProductCatalog) {
			case 1 : new ProductCatalogView(); break;
			case 2 : System.out.println("This function is still under construction");new ProductCatalog();break;
			case 9 : new EmployeeMenu(); break;//needs improvement
			default : System.out.println("Please choose 1,2 or 9"); break;
	        }
			input.close();
	}

}

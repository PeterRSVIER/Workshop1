package rsvier.workshop1;

import java.util.Scanner;

public class ProductCatalogView {

	   public ProductCatalogView() {
		    System.out.println("Product catalog view \n "
		    		+ "1 = View \n"
		    		+ "2 = Modify \n "
		    		+ "3 = Delete \n"
		    		+ "9 = Back");
			Scanner input = new Scanner(System.in);
            int inputProductCatalogView = input.nextInt();
	        switch (inputProductCatalogView) {
	        case 1 : System.out.println("This function is still under construction");new ProductCatalog();break;
	        case 2 : System.out.println("This function is still under construction");new ProductCatalog();break;
	        case 3 : System.out.println("This function is still under construction");new ProductCatalog();break;
	        case 9 : new ProductCatalog(); break;//needs improvement
	        default : System.out.println("Please choose 1,2, 3 or 9");break;
            }
	        input.close();
        }
}
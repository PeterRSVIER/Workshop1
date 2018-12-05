package rsvier.workshop1;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Cheesestore of Peter and Boudy Werkomgeving");
        Boolean isLoginCorrect = false;
		String username, password;
        do {
    		System.out.println("Please enter your username");
        	username = input.nextLine();
        	System.out.println("Please enter your password");
    		password = input.nextLine();
            if (username.equals("RSVier") && password.equals("RSVier"))
            	isLoginCorrect = true;
            else
            	System.out.println("Login incorrect, please retry");
        }
		while (!isLoginCorrect);
        
        EmployeeMenu console = new EmployeeMenu();
        
	}

}
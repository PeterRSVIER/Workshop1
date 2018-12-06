package rsvier.workshop1;
import java.util.*;
public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Cheesestore of Peter and Boudy 2 Werkomgeving");
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
        
        EmployeeMenu employeeMenu = new EmployeeMenu();
        
	}

}
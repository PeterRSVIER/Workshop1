package main;

import java.math.BigDecimal;

import store.Product;
import store.ProductDaoImpl;
import user.Account;
import user.AccountDaoImpl;
import user.AccountType;
import user.AccountTypeDaoImpl;

public class main {

public static void main(String[] args) {
	

// 		What is the use of Setters in our application?	
	
// 		What if column doesnt exist? Now it returns the successful log. We can maybe look into the function EXISTS statement?

//		Do we have to initiate a new connection (login.createconnection) for every query?

// 		How do we assign id's? Now its done manual during object creation. Look into auto increment method of SQL.
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		
		Product PetersPion = new Product("PetersPion", 1, new BigDecimal("6"), 10);
		Product PetersKoning = new Product("PetersKoning", 2, new BigDecimal("15"), 20);
		
		Product PetersPionUpdated = new Product("PetersPionUpdated", 3, new BigDecimal("7"), 10);
		
		productDaoImpl.createProduct(PetersPion);
		productDaoImpl.createProduct(PetersKoning);
		
		productDaoImpl.updateProduct(PetersPionUpdated);

		productDaoImpl.printProduct("PetersPion");
		productDaoImpl.printProduct("PetersPionUpdated");
		productDaoImpl.printProduct(2);
		productDaoImpl.printProduct();

		AccountTypeDaoImpl accountTypeDaoImpl = new AccountTypeDaoImpl();
		AccountType admin = new AccountType (1, "admin");
		accountTypeDaoImpl.createAccountType(admin);
		
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		Account accountPeter = new Account (1,"peterdegraaf1991@hotmail.com","rsvier",1);
		Account accountPeterUpdated = new Account (1,"peterdegraaf0302@gmail.com", "rsvier", 1);
		accountDaoImpl.createAccount(accountPeter);
		accountDaoImpl.updateAccount(accountPeterUpdated);
		accountDaoImpl.printAccount();
	}

}

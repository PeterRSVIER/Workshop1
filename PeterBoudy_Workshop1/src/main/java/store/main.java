package store;

import java.math.BigDecimal;

import user.Account;
import user.AccountDaoImpl;
import user.AccountType;
import user.AccountTypeDaoImpl;

public class main {

public static void main(String[] args) {
	
	
// What if id/name doesnt exist. Methods now still return successful log. (by Peter),
// 		Maybe we can use the EXISTS statement?
	
//		 Do we have to initiate a new connection (login.createconnection) for every query?

		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		
//		for (int i = 0; i < 10; i++)
//			productDaoImpl.deleteProduct(i);
		
		Product PetersPion = new Product("PetersPion", 1, new BigDecimal("6"), 10);
		Product PetersKoning = new Product("PetersKoning", 2, new BigDecimal("15"), 20);
// How is ID from updated product handled? In this example it stays as 1, while PionUpdated has id=2
		Product PetersPionUpdated = new Product("PetersPionUpdated", 3, new BigDecimal("7"), 10);
		
		productDaoImpl.createProduct(PetersPion);
		productDaoImpl.createProduct(PetersKoning);
		
		productDaoImpl.updateProduct(PetersPionUpdated, 1);

		productDaoImpl.printProduct("PetersPion");
		productDaoImpl.printProduct("PetersPionUpdated");
		productDaoImpl.printProduct(2);
		productDaoImpl.printProduct();

		AccountTypeDaoImpl accountTypeDaoImpl = new AccountTypeDaoImpl();
		AccountType admin = new AccountType (1, "admin");
		accountTypeDaoImpl.createAccountType(admin);
		
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		Account accountPeter = new Account (1,"peterdegraaf1991@hotmail.com","rsvier",1);
		Account accountPeterUpdated = new Account (1, "peterdegraaf0302@gmail.com", "rsvier", 1);
		accountDaoImpl.createAccount(accountPeter);
		accountDaoImpl.updateAccount(accountPeterUpdated, "peterdegraaf1991@hotmail.com");
		accountDaoImpl.printAccount();
	}

}

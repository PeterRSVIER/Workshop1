package user;

import java.util.List;
	
	public interface AccountDao {

		public void createAccount(Account account);

		public void updateAccount(Account account);
		
		public void deleteAccount(int id);

		public void printAccount();
		public void printAccount(String email);
		
	}

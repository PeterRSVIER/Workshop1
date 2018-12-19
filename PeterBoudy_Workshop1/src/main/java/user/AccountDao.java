package user;

import java.util.List;
	
	public interface AccountDao {

		public void createAccount(Account account);

		public void updateAccount(Account account, String email);
		public void updateAccount(Account account, int id);
		
		public void deleteAccount(String email);
		public void deleteAccount(int id);

		public void printAccount();
		public void printAccount(String email);
		
// list nodig voor search? public List<Account> getAccounts();

	}

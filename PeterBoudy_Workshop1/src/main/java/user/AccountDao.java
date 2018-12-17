package user;

import java.util.List;
	
	public interface AccountDao {

		public int createAccount(Account account);

		public void updateAccount(Account account);

		public void deleteAccount(Account account);

		public Account getAccountByEmail(String email);
		
		public Account getAccountById(int accountId);
		
		
		
		public List<Account> getAllAccounts();
}

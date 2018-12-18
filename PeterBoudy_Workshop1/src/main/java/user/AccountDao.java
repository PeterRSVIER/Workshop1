package user;

import java.util.List;
	
	public interface AccountDao {

		public String createAccount(Account account);

		public String updateAccount(Account account);

		public String deleteAccount(Account account);

		public Account getAccountByEmail(String email);
		
// list nodig voor search? public List<Account> getAccounts();

	}

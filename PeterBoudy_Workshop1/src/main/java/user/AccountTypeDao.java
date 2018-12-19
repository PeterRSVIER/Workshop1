package user;

public interface AccountTypeDao {

	public void createAccountType(AccountType accountType);

	public void updateAccountType(AccountType accounttype, int type);
	
	public void deleteAccountType(int accounttype);

	public void printAccountType();
	public void printAccountType(int id);
}

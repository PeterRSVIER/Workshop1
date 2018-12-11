package rsvier.workshop1;

public class Account {

	private final int accountId;
	private String email
	,       password
	,       accountType;

	public Account(int accountId, String email, String password, String accountType){
	   this.accountId = accountId;
	   this.email = email;
	   this.password = password;
	   this.accountType = accountType;
    }

	public int getAccountId(){
		return accountId;
		}

	public String getEmail(){
		return email;
		}

	public String getPassword() {
		return password;
		}

	public String getAccountType() {
		return accountType;
		}


	public void setEmail(String email) {
		this.email = email;
		}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override	
	public String toString() {
	  return accountId + " " + email + " " + accountType;
    }


}

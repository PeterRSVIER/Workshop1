package user;

public class Account {

	private final int id;
	private String email;
	private String password;
	private String accountType;

	public Account(int id, String email, String password, String accountType){
	   this.id = id;
	   this.email = email;
	   this.password = password;
	   this.accountType = accountType;
    }

	public int getId(){
		return id;
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
	  return id + " " + email + " " + accountType;
    }


}

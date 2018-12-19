package user;

public class AccountType {

	private int accountType;
	private String description;
	
		public AccountType(int accountType, String description){
			   this.accountType = accountType;
			   this.description = description;	   
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAccountType(){
		return accountType;
	}
	
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
}
//public void printAccountType() {
//switch(accountType){
//case 1: accountType = 0; System.out.println("Accounttype has not been set"); break;
//case 2: accountType = 1; System.out.println("This account has admin privalages"); break;
//case 3: accountType = 2; System.out.println("This account has employee privalages"); break;
//case 4: accountType = 3; System.out.println("This account has client privalages"); break;
//default: System.out.println("The accounttype of this account is invalid");
//}
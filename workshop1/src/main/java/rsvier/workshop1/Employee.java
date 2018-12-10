package rsvier.workshop1;

public class Employee extends Person{

	private int 	idNumber;
	private String 	username,
					password;
	private boolean isAdmin;

	protected Employee(int idNumber, String username, String password, boolean isAdmin) {
	this.idNumber = idNumber;
	this.username = username;
	this.password = password;
	this.isAdmin = isAdmin;
	}
	
// Begin of Employee-Getters 
protected int getIdNumber() {
	return idNumber;
}

protected String getUsername() {
	return username;
}
	
protected boolean getIsAdmin() {
	return isAdmin;
}
// End of Employee-Getters
// Begin of Employee-Setters
protected void setIdNumber(int idNumber) {
	this.idNumber = idNumber;
	}

protected void setUsername(String username) {
	this.username = username;
}

protected void setIsAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
// End of Employee-Setters
}
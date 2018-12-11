package rsvier.workshop1;

public class Employee{

	private final int 	idNumber;
	private String 	firstname
	,				middlename
	,               surname;

	public Employee(int idNumber, String firstname, String middlename, String surname) {
      this.idNumber = idNumber;
	  this.firstname = firstname;
	  this.middlename = middlename;
	  this.surname = surname;
	}
	
// Begin of Employee-Getters 
public int getIdNumber() {
	return idNumber;
}

public String getFirstname() {
	return firstname;
}
	
public String getMiddlename() {
	return middlename;
}

public String getSurname() {
	return surname;
}

// End of Employee-Getters
// Begin of Employee-Setters

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public void setMiddlename(String middlename) {
	this.middlename = middlename;
}

public void setSurname(String surname) {
	this.surname = surname;
}

// End of Employee-Setters
}
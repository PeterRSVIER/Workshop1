package rsvier.workshop1;

public //abstract 
class Person {

	private String firstname
	,              middlename
	,              surname
	,              phoneNumber
	,              email;
	
	public Person() {
	}

	public Person(String firstname, String middlename, String surname, String phoneNumber, String email){
	   this.firstname = firstname;
	   this.middlename =   middlename;
	   this.surname = surname;
	   this.phoneNumber = phoneNumber;
	   this.email = email;
    }

	public String getFirstname(){return firstname;}
    public String getMiddlename(){return middlename;}
	public String getSurname() {return surname;}
	public String getPhonenumber() {return phoneNumber;}
	public String getEmail() {return email;}

    public void setFirstnme(String firstname) {this.firstname = firstname;}
	public void setMiddlename(String middlename) {this.middlename = middlename;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public void setEmail(String email) {this.email = email;}

@Override	
	public String toString() {
	  return firstname + " " + ((middlename != null)? middlename + " " : "") + surname + " " + phoneNumber + " " + email;
    }

}

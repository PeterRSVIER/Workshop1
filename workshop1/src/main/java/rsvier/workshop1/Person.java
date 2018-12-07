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

	private Person(Builder builder){
	   this.firstname = builder.firstname;
	   this.middlename =   builder.middlename;
	   this.surname = builder.surname;
	   this.phoneNumber = builder.phoneNumber;
	   this.email = builder.email;
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

//Inner builder class
    public static class Builder{
      private String firstname
      ,              middlename
      ,              surname
      ,              phoneNumber
      ,              email;

      public Builder firstname(String firstname){
    	  this.firstname = firstname;
    	  return this;
    	  }

      public Builder middlename(String middlename){
    	  this.middlename = middlename;
    	  return this;
    	  }

      public Builder surname(String surname){
    	  this.surname = surname;
    	  return this;
    	  }

      public Builder phoneNumber(String phoneNumber){
    	  this.phoneNumber = phoneNumber;
    	  return this;
    	  }

      public Builder email(String email){
    	  this.email = email;
    	  return this;
    	  }

      public Person build() {
    	  return new Person(this);
      }

    }

}

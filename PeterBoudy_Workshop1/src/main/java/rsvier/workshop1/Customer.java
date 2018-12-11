package rsvier.workshop1;

public class Customer {

	private final int 	customerId,
						accountId;
	private String 		firstname, 
						middlename, 
						surname;
	
	private Customer(Builder builder){
		   this.firstname = builder.firstname;  
		   this.middlename = builder.middlename;
		   this.surname = builder.surname;
		   this.accountId = builder.accountId;
		   this.customerId = builder.customerId;
	    }

	//inner builder class
	public static class Builder{
		private String	firstname
		,              	middlename
		,              	surname;
		private int		accountId
		,				customerId;

        public Builder firstname(String firstname) {
          this.firstname = firstname;
          return this;
        }

        public Builder middlename(String middlename) {
            this.middlename = middlename;
            return this;
          }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
          }

        public Builder accountId(int accountId) {
            this.accountId = accountId;
            return this;
          }

        public Builder customerId(int customerId){
	    	this.customerId = customerId;
	    	return this;
	    	}

	    public Customer build() {
	    	return new Customer(this);
	    }
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getAccountId() {
		return accountId;
	}
	
}

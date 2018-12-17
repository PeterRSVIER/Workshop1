package customerinfo;

public class Customer {

	private final int 	id;
	private final int 	accountId;
	private String	firstname; 
	private String	middlename; 
    private String surname;
	
	private Customer(Builder builder){
		   this.firstname = builder.firstname;  
		   this.middlename = builder.middlename;
		   this.surname = builder.surname;
		   this.accountId = builder.accountId;
		   this.id = builder.id;
	    }

	//inner builder class
	public static class Builder{
		private String	firstname;
		private String 	middlename;
		private String 	surname;
		private int		accountId;
		private int		id;

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

        public Builder id(int id){
	    	this.id = id;
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

	public int getId() {
		return id;
	}

	public int getAccountId() {
		return accountId;
	}
	
}

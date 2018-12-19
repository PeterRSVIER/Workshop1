package customerinfo;

public class Customer {

	private final int 	id;
	private final int 	accountId;
	private String	firstName; 
	private String	middleName; 
    private String surName;
	
    protected Customer() {
    	this.id = 0;
    	this.accountId = 0;
    }

    private Customer(Builder builder){
		   this.firstName = builder.firstName;  
		   this.middleName = builder.middleName;
		   this.surName = builder.surName;
		   this.accountId = builder.accountId;
		   this.id = builder.id;
	    }

    
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accountId != other.accountId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}



	//inner builder class
	public static class Builder{
		private String	firstName;
		private String 	middleName;
		private String 	surName;
		private int		accountId;
		private int		id;

        public Builder firstName(String firstName) {
          this.firstName = firstName;
          return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
          }

        public Builder surName(String surName) {
            this.surName = surName;
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
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddlename(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurname(String surName) {
		this.surName = surName;
	}

	public int getId() {
		return id;
	}

	public int getAccountId() {
		return accountId;
	}
	
}

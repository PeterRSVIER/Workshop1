package rsvier.workshop1;

import rsvier.workshop1.Person.Builder;
import java.util.*;

public class Customer extends Person {

	private final int customerId;
	private int residenceAddress
	,           billingAddress
	,           deliveryAddress;
	ArrayList<Order> orders = new ArrayList<Order>();

	private Customer() {
		// TODO Auto-generated constructor stub
		customerId = 1;
	}
	
	private Customer(Builder builder){
		   this.firstname = builder.firstname;  
		   this.middlename = builder.middlename;
		   this.surname = builder.surname;
		   this.phoneNumber = builder.phoneNumber;
		   this.email = builder.email;
		   this.customerId = builder.customerId;
		   this.residenceAddress = builder.residenceAddress;
		   this.billingAddress = builder.billingAddress;
		   this.deliveryAddress = builder.deliveryAddress;
	    }


//inner builder class
	public static class Builder{
		private int customerId;
		private int residenceAddress
		,           billingAddress
		,           deliveryAddress;
		private String firstname
		,              middlename
		,              surname
		,              phoneNumber
		,              email;

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

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
          }

        public Builder email(String email) {
            this.email = email;
            return this;
          }

        public Builder customerId(int customerId){
	    	this.customerId = customerId;
	    	return this;
	    	}

	    public Builder residenceAddress(int residenceAddress){
	    	this.residenceAddress = residenceAddress;
	    	return this;
	    	}

	    public Builder billingAddress(int billingAddress){
	    	this.billingAddress = billingAddress;
	    	return this;
	    	}

	    public Builder deliveryAddress(int deliveryAddress){
	    	this.deliveryAddress = deliveryAddress;
	    	return this;
	    	}

	    public Customer build() {
	    	return new Customer(this);
	    }
	}
	
}

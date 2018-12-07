package rsvier.workshop1;

import java.util.*;

public class Customer extends Person {

	private int customerId
	,           residenceAddress
	,           billingAddress
	,           deliveryAddress;
	ArrayList<String> orders = new ArrayList <String>();
//	ArrayList<Order> orders = new ArrayList <Order>();


	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstname, String middlename, String surname, String phoneNumber, String email
			       ,int customerId, int residenceAddress, int billingAddress, int deliveryAddress) {
		super(firstname, middlename, surname, phoneNumber, email);
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
		this.residenceAddress = residenceAddress;
		this.billingAddress = billingAddress;
		this.deliveryAddress = deliveryAddress;
	}

	public int getCustomerId(){return customerId;}
	public int getResidenceAddress() {return residenceAddress;}
	public int getBillingAddress() {return billingAddress;}
	public int getDeliveryAddress() {return deliveryAddress;}
	public ArrayList<String> getOrders(){return orders;}
//	public ArrayList<Order> getOrders(){return orders;}

	public void setResidenceAdress(int residenceAddress) {this.residenceAddress = residenceAddress;}
	public void setBillingAddress(int billingAddress) {this.billingAddress = billingAddress;}
	public void setDeliveryAddress(int deliveryAddress) {this.deliveryAddress = deliveryAddress;}

	public void addOrder(String order) {};
	public void removeOrder(String order) {};
//	public void addOrder(Order order) {};
//	public void removeOrder(Order order) {};
	public Customer searchCustomer(int customerId) {return this;}
	public ArrayList<Customer> searchCustomer(String surname){ArrayList<Customer> customers = new ArrayList<Customer>(); return customers;} 

@Override	
	public String toString() {return super.toString() + ", Customer ID " + customerId;}

}

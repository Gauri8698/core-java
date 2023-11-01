//to demostratethe customer

package com.tnsif.constructordemo;

public class Customer {
//data memmbers
	private String customerName;
	private int customerId;
	private float customerPhone;
	
	//default constructor
	public Customer() {
		System.out.println("default constructor");
		
		
	}
	
	//parameterized constructor
	public Customer(String customerName, int customerId, float customerPhone) {
        this(); //to call default constructors
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhone = customerPhone;
		
		
	}
	//getter and setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(float customerPhone) {
		this.customerPhone = customerPhone;
	}

	//to string method= object class
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerPhone="
				+ customerPhone + "]";
	}
	
	
}

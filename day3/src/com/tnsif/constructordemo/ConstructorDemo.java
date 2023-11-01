package com.tnsif.constructordemo;


public class ConstructorDemo {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		System.out.println(cust1);
		
		Customer cust2=new Customer("gauri",12,123456789);
		System.out.println(cust2);
		
		
	}

}

package com.tnsif.constructordemo;
import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		System.out.println(cust1);
		
		Customer cust2=new Customer("gauri",12,123456789);
		System.out.println(cust2);
		
		
		//scannner class to accept user input
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		float phone;
		
		System.out.println("enter name");
		name=sc.next();//
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter phone no");
		phone=sc.nextFloat();
		
		Customer cust3=new Customer(name,id,phone);

		
		Customer cust4=new Customer();
		cust4.setCustomerName(name);
		cust4.setCustomerId(id);
		cust4.setCustomerPhone(phone);
		System.out.println(cust4);
	}

}

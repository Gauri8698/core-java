package com.tnsif.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		OopsDemo  oop=new OopsDemo();
		oop.setSerialNo(10);
		oop.setName("object");
		oop.setAge(18);
		
		
		System.out.println(oop);
		
		OopsDemo  oop1=new OopsDemo();
		oop1.setSerialNo(12);
		oop1.setName("object1");
		oop1.setAge(20);
		
		
		System.out.println(oop1);
	}

}

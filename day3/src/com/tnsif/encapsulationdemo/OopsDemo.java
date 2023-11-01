package com.tnsif.encapsulationdemo;

public class OopsDemo {
	//declaration of data members
	private int serialNo;
	private String Name;
	private int age;
	
	
	//generate getters and setters
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//tostring()method
	@Override
	public String toString() {
		return "OopsDemo [serialNo=" + serialNo + ", Name=" + Name + ", age=" + age + "]";
	}

	
	
	
}

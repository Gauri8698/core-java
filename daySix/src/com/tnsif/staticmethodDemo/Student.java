package com.tnsif.staticmethodDemo;

public class Student {

	int rollno;
	String name;
	static String college = "MCOERC"; //static method
	
	static void change()
	{
		college = "ABCD";
		
	}
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno; //constructor to initialize value
		this.name = name;
	}

	void display() {
		System.out.println(rollno+""+name+""+college); //method to display value
	}
	static //static block.... executes before main method
	{
		System.out.println("I am static Block");
	}
}

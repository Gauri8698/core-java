package com.tnsif.staticmethodDemo;

public class TestStaticMethod {

	public static void main(String[] args) {
	
		Student.change();  //calling change method

//creating object  

Student S1 = new Student(10, "kiran");
Student S2 = new Student(11, "dipti");
Student S3 = new Student(13, "gauri");

S1.display();
S2.display();
S3.display();


	}

}

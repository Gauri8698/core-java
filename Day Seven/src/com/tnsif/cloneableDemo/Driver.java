package com.tnsif.cloneableDemo;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException

	{
		Student s1 = new Student();
		s1.setName("gauri");
		s1.setID(2323);
		s1.setBranch("electronics");
		System.out.println(s1);
		
		Student s2= (Student)s1.clone();
		System.out.println(s2);
		
	}

}

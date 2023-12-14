package com.tnsif.staticmethodDemo2;

public class Employee {

	int empId;
	String empName;
	static String compName = "TNS";
	
	 static void change()
	{
		compName = "TNS Foundation";
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	void  display()
	{
		System.out.println( empId+"  "+empName+"  "+compName);
		
	}

}

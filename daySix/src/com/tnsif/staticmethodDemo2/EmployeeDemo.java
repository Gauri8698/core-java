package com.tnsif.staticmethodDemo2;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee.change();
		
		Employee e1 = new Employee ( 1, " ram ");
		Employee e2 = new Employee ( 2, " sham ");
		Employee e3 = new Employee ( 3, " ritu ");
		Employee e4 = new Employee ( 4, " kajal ");
		Employee e5 = new Employee ( 1, " namu ");
		
		
		e1.display();
		e2.display();
		 e3.display();
		 e4.display();
		 e5.display();
		 

	}

}

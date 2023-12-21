package com.tnsif.unchekExceptionDemo;

public class TryCatchExample {
	
	static void performDivision( int x, int y) {
		try {
			System.out.println("inside the try block");
			int z;
			z=x/y;
			System.out.println("Result Of Division is...."+z);
		} catch (ArithmeticException A) {
			System.out.println("inside the catch block");
			System.err.println("Error occur due to divide bye zero"+A.getMessage());
			
		}finally {
			System.out.println("inside the finally block");
		}
		System.out.println("Statement After finally block");
	}

}

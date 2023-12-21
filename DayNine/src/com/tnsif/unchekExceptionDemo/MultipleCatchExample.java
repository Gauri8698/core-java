package com.tnsif.unchekExceptionDemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchExample {
	
	public static void divide()
	{
	
	float a, b, c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two inputs");
	
	try {
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("Result of divison" +c);
	} catch (ArithmeticException ae) {
		System.err.println("error occur due to divide by zero");
	}catch (InputMismatchException I) {
		System.err.println("enter integer value");
	
	}	catch (Exception e) {
		System.err.println("error handled....");

}
	
	finally
	{
		sc.close();
	}
	}
}

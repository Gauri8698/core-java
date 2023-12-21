package com.tnsif.unchekExceptionDemo;

public class NestedTryCatchExample {
	
	public static void check()
	{
	
	String str="Gauri";
	int slength= str.length();
	System.out.println(slength);
	
	//string 2
	String  anotherString=null;
	
	
	try {
		try {
			System.out.println(str.charAt(8));
		} catch (StringIndexOutOfBoundsException S) {
			System.err.println(" character at these index is not present");
		}

		System.out.println(anotherString.length());
	} catch (NullPointerException npe) {
		System.err.println("String is empty....."+npe.getMessage());
	}
	
	
}
}
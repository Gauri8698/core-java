package com.tnsif.MethodOverloading;

public class Adder {
	
	static int add (int a,int b)
	{
		return a+b;
	}
	
	static int add( int a,int b,int c)  // changing number of arguments
	{
		return a+b+c;
	}
}



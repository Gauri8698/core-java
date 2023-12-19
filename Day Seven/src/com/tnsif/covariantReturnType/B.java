package com.tnsif.covariantReturnType;

public class B extends A {

	@Override
	B show()
	{
		super.show();
		System.out.println("trupti");
		return this;
	}
	
	
	
	public static void main(String[] args) {
		B b=new B();  //tight coupling
		b.show();
		
		

	}

}

package com.tnsif.OverridingDemo;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		
		rbi =new SBI();
		System.out.println("SBI Rate of interest"+rbi.getRateOfInterest());
		
		rbi =new ICICI();
		System.out.println("ICICI Rate of interest"+rbi.getRateOfInterest());
		
		rbi =new Kotak();
		System.out.println("Kotak Rate of interest"+rbi.getRateOfInterest());
		
		
		

	}

}

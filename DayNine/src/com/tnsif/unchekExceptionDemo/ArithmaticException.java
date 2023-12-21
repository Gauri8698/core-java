package com.tnsif.unchekExceptionDemo;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
			int Y= 100/0;
			System.out.println(Y);
		} catch (ArithmeticException A) {
			System.out.println("Division is not posible"+A.getMessage());
		}


	}

}

//Demonstrate unchekedException
package com.tnsif.unchekExceptionDemo;

public class UnchekedException {

	public static void main(String[] args) {
		try {
			int x[];
			
			x=new int[] {1, 2, 3, 4, 5, 6, 7, 8};
			System.out.println(x[13]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println("specified index is not present in the array"+e.getMessage());
		}
		}

}

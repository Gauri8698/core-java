package com.tnsif.controlstatements;

public class NestedForDemo {

	public static void main(String[] args) {
		int beg=3;
		int end=15;

				for(int i=beg;i<=end;i++)
				{for(int j=1;j<=10;j++)
				{
					System.out.println(i*j);
				}
					System.out.println();
				}

	}

}

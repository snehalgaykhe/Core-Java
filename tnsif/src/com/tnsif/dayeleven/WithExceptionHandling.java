package com.tnsif.dayeleven;

public class WithExceptionHandling {

	public static void main(String[] args) {
		int a=12, b=6,c;
		
		try {
			c=a/b;
			System.out.println("Division is "+c);
		}

		catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("------------------------------------");
	}

}

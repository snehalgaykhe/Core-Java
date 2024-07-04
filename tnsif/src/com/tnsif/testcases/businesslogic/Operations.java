package com.tnsif.testcases.businesslogic;

import java.util.function.BooleanSupplier;

public class Operations {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static boolean getFactorial(int n) {
		int f=1;
		for(int i=1; i<=n; i++)
			f=f*i;
		return true;
	}

	public static BooleanSupplier isPrime(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}







































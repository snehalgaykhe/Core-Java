package com.tnsif.testcases.testing;

import org.junit.jupiter.api.*;

import com.tnsif.testcases.businesslogic.Operations;

public class MyTestClass {

	@Test
	public void testAddition()
	{
		int expected=7;
		int actual=Operations.add(2,5);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void getFactorial(){
		System.out.println("Factorial Testing");
		long expected=5040;
		long actual=Operations.getFactorial(7);
		Assertions.assertEquals(expected, actual);
		
	}
	
}

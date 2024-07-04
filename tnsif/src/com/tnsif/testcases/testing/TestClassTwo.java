package com.tnsif.testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.testcases.businesslogic.Operations;

public class TestClassTwo {

	@TestFactory
	public DynamicTest testMethod() {
		return DynamicTest.dynamicTest("First Dynamic Test",()->{Assertions.assertTrue(Operations.getFactorial(5));});
	}
}

package com.tnsif.testcases.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


//@Disabled
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleTestClass {
	
	@RepeatedTest(2)//if we enter 0 or 1 it will give error
	//@Test
	public void testMethodone(){//Test Method
		System.out.println("This is test method one :"+this);
		
	}
	//@Disabled// Disabled the test
	@Test
	public void testMethodtwo() {//Test Method
		System.out.println("This is test method two :"+this);
		
	}
	
	@BeforeAll//LifeCycle Method
	// public static void beforeAllLifeCycleMethod() {
	public void beforeAllLifeCycleMethod() {
		System.out.println("Before All");
	}
	
	@AfterAll//LifeCycle Method
	// public static void  afterAllLifeCycleMethod() {
	public void afterAllLifeCycleMethod() {
		System.out.println("After All");
	}
	
	@BeforeEach//LifeCycle Method
	public void beforeEachAllLifeCycleMethod() {
		System.out.println("Before Each");
	}
	
	@AfterEach//LifeCycle Method
	public void afterEachAllLifeCycleMethod() {
		System.out.println("Before All");
	}
	
}

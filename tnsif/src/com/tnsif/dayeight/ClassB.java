package com.tnsif.dayeight;

public class ClassB implements MyInterface, FirstInterface {
	
	@Override
	public String greet() {
		
		return "Hello";
	}
	
	@Override
	public void show() {
		System.out.println("Show() overriden from Myinterface");
	}

}

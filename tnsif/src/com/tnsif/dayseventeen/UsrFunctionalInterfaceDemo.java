package com.tnsif.dayseventeen;

public class UsrFunctionalInterfaceDemo {

	public static void main(String[] args) {
		System.out.println("Using Lambda Expression");
		
		GreetInterface greet = (s) -> "Hello!" +s ;
		
		System.out.println("\n"+greet.sayHello("Sanu"));
		
		greet = (s) -> "Hi!"+s+" How are you?";
		System.out.println("\n\nUsing Implements");
		
		greet = new Greet1();
		System.out.println("\n"+greet.sayHello("Pratham"));
		
		greet = new Greet2();
		System.out.println("\n"+greet.sayHello("Varun"));

	}

}

class Greet1 implements GreetInterface{
	
	@Override
	public String sayHello(String name) {
		return "Hello "+name;
		
	}

	
}
class Greet2 implements GreetInterface{

	@Override
	public String sayHello(String name) {
		
		return "Hi! "+name+" How are you?";
	}

	
}

package com.tnsif.daynine.runtimepolymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		
		ClassA a;
		
		a=new ClassA();
		a.setN(56);
		a.show();// show() of classA
		
		ClassB b=new ClassB();
		
		a=new ClassB();
		a.setN(23);
		a.show();// show() of classB
		
		ClassB b1=new ClassB();
		
		b1=new ClassB();
		b1.setName("Snehal");
		b1.show();
		
		Person person = new Person("Snehal","Nashik");
		Student student=new Student(101,"IT");
		
		System.out.println(person);
		System.out.println(student);
	}

}

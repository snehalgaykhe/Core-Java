package com.tnsif.daysix;

public class SingleInheritance {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		//System.out.println(p1.toString());
		System.out.println(p1);// calling toString method
		
		Person p2 = new Person("Snehal",45);
		System.out.println(p2);
		
		Student st = new Student("Snehal",21,6);
		System.out.println(st);

	}

}

//program to create child class from ClassA

package com.tnsif.dayfour.p1;

public class ClassC extends ClassA {
	
	//default constructor
	public ClassC() {
		System.out.println("ClassC default constructor");
		// System.out.println(privateNum); private member is not accessible
		System.out.println(publicNum);
		System.out.println(protectedNum);
		System.out.println(num);
		System.out.println("----------------------------");
		
	}
	
	public static void main(String args[]) {
		System.out.println("______________________________");
		ClassC objC =  new ClassC();
		
		// System.out.println(objC.privateNum); Private member is not accessible
		System.out.println(objC.publicNum);
		System.out.println(objC.protectedNum);
		System.out.println(objC.num);
		System.out.println("----------------------------");
		System.out.println(objC); //call toString method of classA
		
	}
}


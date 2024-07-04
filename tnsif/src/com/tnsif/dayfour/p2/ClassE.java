package com.tnsif.dayfour.p2;

import com.tnsif.dayfour.p1.ClassA;

public class ClassE extends ClassA{
	
	public ClassE() {
		System.out.println("ClassC default constructor");
		// System.out.println(privateNum); //Private member is not inherited outside class 
		System.out.println(protectedNum);
		System.out.println(publicNum);
		// System.out.println(num); default member can't be accessible outside package
		System.out.println("---------------------------");
		
	}
	
	public static void main(String args[]) {
		System.out.println("_____________________________");
		ClassE objC = new ClassE();
		
		// System.out.println(objC.privateNum); //Private member is not accessible
		System.out.println(objC.protectedNum);
		// System.out.println(objC.num);// Default member can't be accessible outside package
		System.out.println("------------------------------");
		}

}

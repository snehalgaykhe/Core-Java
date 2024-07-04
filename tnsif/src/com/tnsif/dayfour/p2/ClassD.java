package com.tnsif.dayfour.p2;

import com.tnsif.dayfour.p1.ClassA;

public class ClassD {
	
	public static void main(String args[]) {
		// classA from another package
		
		ClassA objA= new ClassA();
		
	    // System.out.println(objA.privateNum);Private member is not accessible
		System.out.println(objA.publicNum);
		// System.out.println(objA.protectedNum);  // Protected member is not accessible in another package non-subclass
		// System.out.println(objA.num); // Default member is not accessible in another package
		System.out.println("----------------------------------------------------");
	}

}

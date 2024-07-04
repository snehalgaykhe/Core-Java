package com.tnsif.dayfour.p1;

public class ClassB {

		public static void main (String args[]) {
			
			ClassA objA=new ClassA();
			
			//System.out.println(objA.privateNum);Private member is not accessible
			
			System.out.println(objA.publicNum);
			System.out.println(objA.protectedNum);
			System.out.println(objA.num);
			System.out.println("-------------------------------");
			System.out.println(objA); // call toString method of ClassA
			
			ClassB objB=new ClassB();
			System.out.println(objB);
		}
	
}

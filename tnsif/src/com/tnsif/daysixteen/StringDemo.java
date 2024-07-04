package com.tnsif.daysixteen;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello"; // allocation to the heap pool
		String s2 = "Hello"; // points to the memory location of s1
		String s3 = new String("Hello"); // allocation  of direct heap memory
		
		System.out.println("s1 == s2 ?"+(s1 == s2)); //Point to the same memory location  , returns true
		System.out.println("s1 == s3 ?"+(s1 == s3)); // Point to the different memory location  , returns false
		System.out.println("s1.equals(s3) ?"+(s1.equals(s3))); // checks whether contents of object is same or not 
		
		String s4 = s1;
		String s5 = s3;
		String s6 = new String(s3);
		String s7 = s3.intern();
		
		
		System.out.println("s1 == s4 ?"+(s1 == s4)); // it checks memory reference - true
		System.out.println("s3 == s5 ?"+(s3 == s5)); // it checks memory reference 
		System.out.println("s3 == s6 ?"+(s3 == s6)); // it checks memory reference 
		System.out.println("s7 == s3 ?"+(s7 == s3)); // it checks memory reference 
		
		
		System.out.println(s1.hashCode());
		System.out.println("------------------------------------------------");
		
		
		s1="Hi"; //create another instance on string pool
		s3+="How are  yoy?"; // create another instance on string pool and s3 get refer that 
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println("s1 == s2 ?"+(s1 == s2));// new memory location, it checks memory reference 
		System.out.println("s1 == s3 ?"+(s1 == s3)); // it checks memory reference 
		System.out.println("s5 == s3 ?"+(s5 == s3)); // it checks memory reference 
		
		
		

	}

}

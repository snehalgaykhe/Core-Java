package com.tnsif.daynineteen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		PalindromeClass obj=new PalindromeClass();
		obj.display(10);
		obj.display("PVGCOE");
		obj.display(true);
		obj.display(65.45);

		System.out.println("is  10 Palindrome? : "+obj.checkPalindrome(10));
		System.out.println("is  101 Palindrome? : "+obj.checkPalindrome(101));
		
		
		System.out.println("is CAR Palindrome? : "+obj.checkPalindrome("CAR"));
		System.out.println("is  MAM Palindrome? : "+obj.checkPalindrome("MAM"));
		
		System.out.println("is  10 Palindrome? : "+obj.checkPalindrome(10.1F));
	
	
	}
}

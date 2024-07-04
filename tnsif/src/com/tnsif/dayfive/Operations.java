package com.tnsif.dayfive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
	
	//Check weather number is even or odd
	public void checkevenOdd(int n) {
		if (n% 2==0) 
			System.out.println("even number");
		
		else 
			System.out.println("odd number");
			
	}

	// return factorial of a given number 
	public long getFactorial(int n) {
		long factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial *= 1;
		}
		return factorial;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Operations obj= new Operations();
		int n;
		
		System.out.println("Enter the number: ");
		// n=sc.nextInt();	
		n = Integer.parseInt(br.readLine());

		
		obj.checkevenOdd(n);
		
		System.out.println("Factorial is "+ obj.getFactorial(n));
		// System.out.println(sc.nextLine());
		// System.out.println(sc.next());
		
	}
	

}

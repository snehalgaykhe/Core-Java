package com.tnsif.dayeleven;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int a,b,c;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two no.:");
			a= sc.nextInt();
			b= sc.nextInt();
			c=a/b;
			System.out.println("Division is"+c);
			System.out.println(args[0]);
		}
		catch (Exception e) {
			System.out.println("Error ocurred.."+e);
		}
		/*
		 * catch (InputMismatchException e){
		 * System.err.println("Error..Invalid Input.."+e.getMessage());
		 */

		System.out.println("-------------------------------");
	}

}

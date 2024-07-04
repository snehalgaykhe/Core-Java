package com.tnsif.dayfour.p1;


public class ClassA {
	
	private int privateNum;
	public int publicNum;
	protected int protectedNum;
	int num;
	
	//default constructor
	public ClassA() {
		
		System.out.println("ClassA dafault constructor...");
		privateNum = 12;
		publicNum = 29;
		protectedNum = 24;
		num = 14;
		
		}

	@Override
	public String toString() {
		return "ClassA [privateNum=" + privateNum + ", publicNum=" + publicNum + ", protectedNum=" + protectedNum
				+ ", num=" + num + "]";
	}

}

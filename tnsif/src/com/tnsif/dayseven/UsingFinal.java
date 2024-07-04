package com.tnsif.dayseven;

public class UsingFinal {
	
	int x;
	final int y=10;// constant with value 10
	final int z; //initialize constant using constructor
	
	
	public UsingFinal() {
		x++;
	//  y++; The final y cannot be assigned
		z = 34;
	}


	public UsingFinal(int value) {
		x = value;
		z = value;
	//	y = value; The final value cannot be assigned
	}


	@Override
	public String toString() {
		return "UsingFinal [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	

}

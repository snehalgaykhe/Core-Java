package com.tnsif.dayeight;

public class ClassD implements OuterInrface.InnerInterface {
	
	@Override
	public void display() {
		System.out.println(OuterInrface.N);
		System.out.println(OuterInrface.InnerInterface.N);
	}

}

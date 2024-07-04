package com.tnsif.daytwenty;

import java.lang.annotation.Annotation;

public class Demo {
	
	
	public static void main(String[] args) {
	
		AdroidSeries obj = new AdroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.ScreenSize);
		
		
		Class c = obj.getClass();
		System.out.println("SmartTV Details");
		Annotation an1= c.getAnnotation(SmartTV.class);
		
		SmartTV s1 = (SmartTV) an1;
		
		System.out.println(s1.os());
		System.out.println(s1.price());
		
	}

}

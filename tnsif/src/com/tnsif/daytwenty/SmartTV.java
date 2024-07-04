package com.tnsif.daytwenty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)//tells when the working perform in compile time or runtime
	
	
	public @interface SmartTV {

		String os();
		int price() default 56000;
		
}

package com.tnsif.daysixteen;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb;
		String s="Hello";
		System.out.println("String is "+s);
		sb = new StringBuffer(s);
		
		sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(" How are you ?");
		System.out.println(sb);
		sb.replace(0, 5, "Hi!");
		System.out.println(sb);
		sb.reverse();

		System.out.println(sb);
		
		s=sb.toString();
		System.out.println("String is "+s);
	}

}

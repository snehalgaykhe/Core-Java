package com.tnsif.daynine.runtimepolymorphism;

public class Student extends Person {
	
	private int rno;
	private String course;
	
	public Student() {
		super();
		
	}

	public Student(int rno, String course) {
		super();
		this.rno = rno;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", course=" + course + "]";
	}
	
	
	

}

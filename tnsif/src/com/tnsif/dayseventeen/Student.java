package com.tnsif.dayseventeen;

public class Student {
	private int rno;
	private String name;
	private float per;
	private String stream;
	
	public Student() {
		super();
		
	}

	public Student(int rno, String name, float per, String stream) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
		this.stream = stream;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + ", stream=" + stream + "]";
	}
	
	

}

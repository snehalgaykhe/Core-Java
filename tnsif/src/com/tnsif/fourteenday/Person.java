package com.tnsif.fourteenday;

public class Person {

	private String name;
	private String city;
	private long contactNo;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, String city, long contactNo) {
		super();
		this.name = name;
		this.city = city;
		this.contactNo = contactNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", contactNo=" + contactNo + "]";
	}
	
	
}

package com.tnsif.dayfifteen;

public class Emp {
	private int empId;
	private String name;
	private int salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

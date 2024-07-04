package com.tnsif.fourteenday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee (112,"Snehal", 30000));
		empList.add(new Employee (102,"Mansi", 45000));
		empList.add(new Employee (123,"Varun", 22000));
		empList.add(new Employee (132,"Tejal", 65000));
		empList.add(new Employee (172,"Aditya", 34000));
		empList.add(new Employee (145,"Nilam", 25000));
		
		System.out.println("Employee Details :\n"+empList);
		

		Comparator<Employee> emp=(e1,e2)-> e1.getName().compareTo(e2.getName());
		Collections.sort(empList, emp);
		System.out.println("Ascending order of name :"+empList);
		
		
		Comparator<Employee> empSalary=(e1,e2)->(int) (e1.getSalary()-e2.getSalary());
		Collections.sort(empList, empSalary);
		System.out.println("Ascending order of salary :"+empList);
	
	
	}

}

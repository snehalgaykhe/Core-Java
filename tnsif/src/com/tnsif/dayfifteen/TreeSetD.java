package com.tnsif.dayfifteen;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetD {
	public static void main(String[] args) {
		TreeSet<String> courseSet=new TreeSet<String>();
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("Angular");
		courseSet.add("React");
		
		System.out.println(courseSet);
		System.out.println("First Course : "+courseSet.first());
		System.out.println("Last Course : "+courseSet.last());
		System.out.println("------------------------------------------------------------------------------");
		
		courseSet.remove("Removing element C: "+courseSet.remove("C"));
		System.out.println(courseSet);
		
		courseSet.pollFirst();
		System.out.println(courseSet);
		
		courseSet.pollLast();
		System.out.println(courseSet);
		System.out.println("------------------------------------------------------------------------------");
		
		//courseSet.add(null);
		
		Comparator<Emp> comp1=(e1,e2)-> e1.getEmpId()-e2.getEmpId();
		
		Comparator<Emp> comp2=(e1,e2)-> (int) (e1.getSalary()-e2.getSalary());
		
		Comparator<Emp> comp3=(e1,e2)-> e1.getName().compareTo(e2.getName());
		
		TreeSet<Emp> empSet=new TreeSet<Emp>(comp3);
		empSet.add(new Emp(110,"Snehal",34000));
		empSet.add(new Emp(121,"neha",40000));
		empSet.add(new Emp(101,"Nitish",20000));
		empSet.add(new Emp(120,"Pratik",55000));
		empSet.add(new Emp(131,"Ved",56000));
		
		System.out.println("Employee Details : "+empSet);
	}
}

package com.tnsif.fourteenday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HomogenousList {

	public static void main(String[] args) {
		
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Aniket");
		nameList.add("Mrunal");
		nameList.add("Nikita");
		nameList.add("Tejswini");
		nameList.add("Bhumi");
		System.out.println("List is :"+nameList);
		Collections.sort(nameList);
		System.out.println("List is :"+nameList);
		
		//Creating Persons List
		ArrayList<Person> perList=new ArrayList<Person>();
		perList.add(new Person("Vaibhav","Pune",7656565569L));
		perList.add(new Person("Advika","Mumbai",8767567758L));
		perList.add(new Person("Vedant","Nashik",7776857885L));
		perList.add(new Person("Tushar","Banglore",7264856466L));
		perList.add(new Person("Shrinu","Nashik",8897879878L));
		System.out.println("Person List \n"+perList);
		
		Iterator<Person> it=perList.iterator();
		while(it.hasNext()) {
			Person p=it.next();
			System.out.println("\n"+p);
			
			System.out.println(perList.size());
			
		
		Comparator<Person> comp=(p1,p2)-> p1.getName().compareTo(p2.getName());
		Collections.sort(perList, comp);
		System.out.println("Person List sorting in Ascending order \n"+perList);
		
		comp=(p1,p2)-> (int) (p1.getContactNo()-p2.getContactNo());
		Collections.sort(perList, comp);
		System.out.println("Sorting ContactNo in Ascending order \n"+perList);
		
			
		}
	}

}

package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		
		lhs.add(40);
		lhs.add(30);
		lhs.add(60);
		lhs.add(50);
		lhs.add(70);
		lhs.add(70);
		
		System.out.println(lhs);
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		
		System.out.println("\nSize: "+lhs.size());
		lhs.remove(50);
		lhs.add(60);
		System.out.println(lhs);
		
		//Collection.sort(lhs); not applicable for LinkedHashSet
		
		System.out.println("-------------------------------------------");
		
		ArrayList<Integer> a=new ArrayList<Integer>(lhs);
		System.out.println("ArrayList: "+a);
		
		Collections.sort(a);
		System.out.println("----------------------------------------------------");
		System.out.println("After Sorting: ");
		
		lhs=new LinkedHashSet<Integer>(a);
		System.out.println(lhs);
		

	}

}

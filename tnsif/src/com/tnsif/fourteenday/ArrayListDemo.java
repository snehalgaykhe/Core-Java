package com.tnsif.fourteenday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Raw List - Heterogeneous elements
		ArrayList a=new ArrayList();
		
		a.add(30);
		a.add(20);
		a.add(80);
		a.add(70);
		a.add(90);
		a.add(40);
		
		System.out.println("ArrayList :"+a);
		System.out.println("Size of ArrayList is :"+a.size());
		a.add("Hello");
		a.add(12.3f);
		a.add(50);
		a.add(120);
		System.out.println("ArrayList :"+a);
		System.out.println("Is 30 present? :"+a.contains(30));
		System.out.println("Is 50 present? :"+a.contains(50));
		System.out.println("Index of 20 is :"+a.indexOf(20));
		System.out.println("Last index of :"+a.lastIndexOf(50));
		System.out.println("Giving index of value in remove(3)-- value=70 :"+a.remove(3));
		System.out.println("ArrayList after remove:"+a);
		System.out.println(a.remove(a.indexOf(50)));
		System.out.println("ArrayList after remove:"+a);
		System.out.println(a.remove(Integer.valueOf(40)));
		System.out.println("ArrayList after remove:"+a);
		
		/*Collections.sort(a);
		System.out.println("List after sorting :"+a);
		*/
		
		Iterator i=a.iterator();
		System.out.println("----------------------------------------");
		while(i.hasNext())
			System.out.println(i.next());
		
		
	}

}

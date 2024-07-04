package com.tnsif.dayfifteen;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		System.out.println(hs1.add(40));
		hs1.add(90);
		hs1.add(70);
		hs1.add(20);
		hs1.add(10);
		hs1.add(50);
		hs1.add(80);
		
		System.out.println("First set: "+hs1);
		System.out.println("-----------------------------------------");
		
		//sort() not applicable for HashSet
		//Collections.sort(hs);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(400);
		hs2.add(90);
		hs2.add(200);
		hs2.add(20);
		hs2.add(80);
		hs2.add(50);
		hs2.add(700);
		
		System.out.println("Second set: "+hs2);
		System.out.println("-----------------------------------------");
		
		System.out.println("Union");
		hs1.addAll(hs2);//Union
		
		System.out.println("First set: "+hs1);
		System.out.println("Second set: "+hs2);
		System.out.println("--------------------------------------------");
		
		hs1.clear();
		hs1.add(80);
		hs1.add(70);
		hs1.add(20);
		hs1.add(50);
		hs1.add(50);
		System.out.println("First set: "+hs1);
		System.out.println("Second set:  "+hs2);
		
		System.out.println("Set Difference");
		hs1.remove(hs2);//Set Differece
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
	}

}

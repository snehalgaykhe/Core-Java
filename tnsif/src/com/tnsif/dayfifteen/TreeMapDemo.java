package com.tnsif.dayfifteen;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String , String> personMap = new TreeMap<String, String>();
		personMap.put("snehalg@gmail.com","Snehal");
		personMap.put("avantikaj@gmail.com","Avantika");
		personMap.put("snehab@gmail.com","Sneha");
		personMap.put("sejalj@gmail.com","Sejal");
		personMap.put("dhanashrees@gmail.com","Dhnashree");
		
		System.out.println(personMap);
		System.out.println("----------------------------------------");
	
		personMap.put("snehalg@gmail.com","Snehal gaykhe");
		System.out.println(personMap+"\n");
		System.out.println("----------------------------------------");
		
		
		personMap.put("snehalgaykhe003@gmail.com","Snehal Gaykhe");
		System.out.println(personMap+"\n");
		System.out.println("----------------------------------------");
	
		Set<String> emailIdSet=personMap.keySet();
		
		System.out.println("Key Set: "+emailIdSet);
		System.out.println("----------------------------------------");
	
		Collection<String> name=personMap.values();
		System.out.println(name);
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("Getting value through key: "+personMap.get("sejalj@gmail.com"));
		System.out.println("------------------------------------------------------------------------------");
		
		Set<Entry<String, String>> persons=personMap.entrySet();
		
		Iterator<Entry<String, String>> p=persons.iterator();
		
		while(p.hasNext()) {
			
			Map.Entry<String, String> entry=p.next();
			System.out.println(entry);
			
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
	}

}

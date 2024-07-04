package com.tnsif.dayseventeen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		

		/*System.out.println(Thread.currentThread().getName());
		
		Runnable r=()->{
			for(int i=0;i<=50;i++) 
				System.out.println(Thread.currentThread().getName() + " Hello");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		};
		
		Thread t1=new Thread(r, "Thread1");
		
		Thread t2=new Thread(r, "Thread2");
		t1.start();
		t2.start();
		
		r=()->{
			int i=2;
			while(i<=100) {
				System.out.println(Thread.currentThread().getName());
				i+=2;
				try {
					Thread.sleep(200);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		Thread t3=new Thread(r,"Thread");
		t3.start();
	}
		;*/

		ArrayList<Integer> numList=new ArrayList<Integer>();
		numList.add(40);
		numList.add(90);
		numList.add(60);
		numList.add(30);
		numList.add(20);
		numList.add(70);
		numList.add(80);
		
		System.out.println("Before sorting Num List :" +numList);
		Collections.sort(numList);
		System.out.println("Sorting on Ascending :" +numList);
		
		Comparator<Integer> comp= (n1,n2) -> n2-n1;
		Collections.sort(numList, comp);
		System.out.println("Sorting on Descending :" +numList);
		System.out.println("_______________________________________________________________________________________________________");
		
		
		
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Snehal");
		nameList.add("Sejal");
		nameList.add("Sneha");
		nameList.add("Pawan");
		nameList.add("Anand");
		nameList.add("Avantika");
		nameList.add("Mansi");
		
		System.out.println("\n-----------------------------------------------------------------------------------------------------");
		System.out.println("Before sorting :"+nameList);
		
		
		Collections.sort(nameList);
		System.out.println("Sorting on Ascending :"+nameList);
		
		Comparator<String> strComp=(s1,s2)->s2.compareTo(s1);
		Collections.sort(nameList, strComp);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("Sorting on Descending :"+nameList);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(new Student (10,"Nikhil",54,"IT"));
		studList.add(new Student (10,"Anvi",45,"CSE"));
		studList.add(new Student (14,"Nilam",23,"AIDS"));
		studList.add(new Student (7,"Nikita",20,"IT"));
		studList.add(new Student (17,"Neha",34,"Mech"));
		studList.add(new Student (10,"Savni",67,"EE"));
		System.out.println("Beorfore sorting :"+studList);
		
		Comparator<Student> strComp1=(s1,s2)-> s1.getStream().compareTo(s2.getStream());
		Collections.sort(studList, strComp1);
		
		System.out.println("Sorting in Ascending on Stream :"+studList);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("Before sorting on Name :"+studList);
		
		Comparator<Student> strComp2=(s1,s2)-> s2.getName().compareTo(s1.getName());
		Collections.sort(studList, strComp2);
		
		System.out.println("Sorting in Descending on Name :"+studList);
		
		
	
	}

}
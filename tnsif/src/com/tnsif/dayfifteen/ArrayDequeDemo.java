package com.tnsif.dayfifteen;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> aQueue=new ArrayDeque<Integer>();
		aQueue.add(50);
		aQueue.add(90);
		aQueue.add(30);
		aQueue.add(60);
		aQueue.add(20);
		aQueue.add(80);
		aQueue.add(40);
		
		System.out.println(aQueue);
		System.out.println("----------------------------------");
		
		aQueue.addFirst(70);
		aQueue.addLast(10);
		System.out.println(aQueue);
		System.out.println("----------------------------------");
		
		
		System.out.println("First element :"+aQueue.getFirst());
		System.out.println("Last element :"+aQueue.getLast());
		System.out.println("Remove first element :"+aQueue.removeFirst());
		System.out.println("Remove last element :"+aQueue.removeLast());
		System.out.println("\nList after removing: "+aQueue);
		System.out.println("----------------------------------");
		
		
		while(!aQueue.isEmpty()) {
			System.out.println("Remove Element: "+aQueue.remove());
		}
	}

}

package com.tnsif.dayfifteen;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	

	public static void main(String[] args) {

		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
        pQueue.add(40);
        pQueue.add(60);
        pQueue.add(80);
        pQueue.add(30);
        pQueue.add(10);
        pQueue.add(20);
        
        System.out.println(pQueue);
        System.out.println("---------------------------------");
        
        while(!pQueue.isEmpty()) {
        	System.out.println(pQueue.remove());
        }
	
	}
	}

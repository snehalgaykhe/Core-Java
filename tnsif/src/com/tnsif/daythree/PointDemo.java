package com.tnsif.daythree;

public class PointDemo {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point(); //default constructor
		p1.display();
		
		Point p2= new Point(4.50f); //single parameter constructor
		p2.display();
		
		Point p3= new Point(10.65f, 70.4f); //double parameter constructor
		p3.display();
		
		p1.setX(20f);
		p1.setY(23.65f);
		
		
		System.out.println(p1.getX() + ", " + p1.getY());

	}

}

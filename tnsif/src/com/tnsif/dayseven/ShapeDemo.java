package com.tnsif.dayseven;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape s;
		
		// s=new Shape(); Cannot intantiate the type Shape as it is abstract
		s=new Circle();
		Circle c=(Circle)s;
		c.setRadius(5.4f);
		c.calculateArea();
		c.show();
		
		System.out.println("----------------------------------------");
		
		s =new Square(10);
		s.calculateArea();
		s.show();
	}

}

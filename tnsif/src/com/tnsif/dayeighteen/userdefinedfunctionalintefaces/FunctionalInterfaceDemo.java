package com.tnsif.dayeighteen.userdefinedfunctionalintefaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetInterface obj=(s)->System.out.println("Hello " +s);
		obj.greet("Students");
		obj=(s)->System.out.println("Good Morning"+s);
		obj.greet(" Students");
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		ArithmeticOperations opr;
		opr=(x,y)->x+y;
		int result=opr.perform(10, 34);
		System.out.println("Addition is :"+result);
	
		
		opr=(x,y)->x-y;
		int result1=opr.perform(100, 34);
		System.out.println("Substraction is :"+result1);
		
		opr=(x,y)->x*y;
		int result2=opr.perform(10, 10);
		System.out.println("Multiplication is :"+result2);
		
		opr=(x,y)->x/y;
			int result3=opr.perform(150, 15);
		System.out.println("Division is :"+result3);
		
		opr=(x,y)->{
			int p=1;
			while(y>0) {
				p=p*x;
				y--;
			}
		return p;
		};	
		int result4=opr.perform(4, 3);
		System.out.println("Power is :"+result4);
		
	
	}

}


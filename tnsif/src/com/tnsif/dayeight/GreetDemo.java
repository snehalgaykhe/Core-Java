package com.tnsif.dayeight;

public class GreetDemo {

	public static void main(String[] args) {
		
		GreetImp obj=new GreetImp();
		System.out.println(obj.sayHello("Snehal"));
		
		GreetImp obj2=new GreetImp();
		System.out.println(obj2.sayHello("Nilam"));
		
		//using Lambda Expressionn
		IGreet iobj=(name)->"Hii"+name;
		System.out.println(iobj.sayHello("Mansi"));
		
		//OR
		
		iobj=(name)->{
			return ("Good Morning"+name);
		};
		System.out.println(iobj.sayHello("Jay"));

	}

}

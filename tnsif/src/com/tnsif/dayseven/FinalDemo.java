package com.tnsif.dayseven;

public class FinalDemo {

	public static void main(String[] args) {
		
		UsingFinal obj = new UsingFinal();
		System.out.println(obj);
		
		UsingFinal obj1 = new UsingFinal(5);
		System.out.println(obj1);
		
		UsingFinal obj2 = new UsingFinal(100);
		System.out.println(obj2);

	}

	public class ClassA{
		
		public ClassA(){
			
			System.out.println("This is final class");
		}
	}
	
	/*
	 *can't create child from final ClassA
	 */
	
	class ClassX{
		public void show() {
			System.out.println("show() in ClassX");
		}
		
		public final void display() {
			System.out.println("display() in ClassX");
		}
	}

	class ClassY extends ClassX{
		public void show() {
			System.out.println("show() in Classx");
			
		}
			
			//final method can't be override
			/*
			 * 
			 * public final void display(){
			 * System.out.println("display() in ClassX");
			 * }
			 */
		}
	}


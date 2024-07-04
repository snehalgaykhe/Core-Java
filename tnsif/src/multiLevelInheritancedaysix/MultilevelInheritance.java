package multiLevelInheritancedaysix;

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		
		ClassA a=new ClassA();
		a.show();
		System.out.println("----------------------------------------------");

		ClassB b1 =new ClassB();
		b1.show();
		System.out.println("----------------------------------------------");
		
		ClassB b2 = new ClassB(23,"Snehal");
		b2.show();
		System.out.println("----------------------------------------------");
		
		ClassC c1 =new ClassC();
		c1.show();
		System.out.println("----------------------------------------------");
		
		ClassC c2 = new ClassC(34,"Nilam", 65.7f);
		c2.show();
		System.out.println("----------------------------------------------");
		
	}

}

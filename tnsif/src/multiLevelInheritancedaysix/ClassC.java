package multiLevelInheritancedaysix;

public class ClassC extends ClassB {

	
	private float per;
	
	public ClassC() {
		
		this(108,"Rushi", 80.65f);
		System.out.println("ClassB default constructor");
		
	}

	public ClassC(int num, String name, float per) {
		super(num, name);
		this.per = per;
		System.out.println("ClassC Parameterized ");
	}
	
	public void show() {
		
		super.show();
		System.out.println("Percentage :"+this.per);
	}
}

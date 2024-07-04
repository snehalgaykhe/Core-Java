package com.tnsif.dayseven;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setUid("T05040750");
		s1.setBranch("Snehal");
		s1.setBranch("IT");
	//  Student.setTechTrainer("Alpna");
	//  Student.setSoftskillTrainer("Divya");
		
		Student s2 =new Student();
		s2.setUid("T05040750");
		s2.setName("Nilam");
		s2.setBranch("AIDS");
	//  Student.setTechTrainer("Alpna");
	//  Student.setSoftskillTrainer("Divya");	
		
		Student s3= new Student("T05040750","Sneha","IT");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}

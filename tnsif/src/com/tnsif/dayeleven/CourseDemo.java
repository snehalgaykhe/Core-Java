package com.tnsif.dayeleven;

public class CourseDemo {

	public static void main(String[] args) {
		StudentInfo s;
		try {
			s = new StudentInfo("Snehal","BE");
			System.out.println(s);
			
			StudentInfo ss=new StudentInfo();
			ss.setName("Mansi");
			ss.setCourse("MSc");
			System.out.println(ss);
			
			StudentInfo sss=new StudentInfo("Nilam","BE");
		}

		catch(InvalidCourseException e) {
			System.out.println("Error.."+e);
		}
	}

}

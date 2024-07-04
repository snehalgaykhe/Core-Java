package com.tnsif.fourteenday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		studentList.add(new Student(34,"Vikas",80));
		studentList.add(new Student(21,"Sahil",87));
		studentList.add(new Student(26,"Rushi",90));
		studentList.add(new Student(45,"Nikhil",95));
		studentList.add(new Student(56,"Akash",89));
		
		System.out.println(studentList);
		
		
		Comparator<Student> studcom=(s1,s2)-> (int) (s1.getPer()-s2.getPer());
		Collections.sort(studentList, studcom);
		System.out.println("Sorting students on Percentage : "+studentList);
		
		
	}

}

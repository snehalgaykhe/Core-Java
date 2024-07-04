package com.tnsif.dayseven;

public class Student {
	
	private String uid, name, branch;
	static private String techTrainer="Alpna", softskillTrainer;
	static final String Collegename = "PVG,  Nashik";
	
	static {
	//	techTrainer = "Alpna";
		softskillTrainer = "Divya" ;
		initializeStaticMembers();
	}
	
	public static void initializeStaticMembers() {
	//  this.techTrainer = "ABC" ; // This keywordcan't be used in static member
		techTrainer = "Divya Kalarikal";
	//  branch = "IT"; Non static members can't be accessed in static member
		
	}

	public static String getSoftskillTrainer() {
		return "Divya K";
		}
	
	public Student() {
		
	}

	public Student(String uid, String name, String branch) {
		super();
		this.uid = uid;
		this.name = name;
		this.branch = branch;
	//	techTrainer = "Alpna";
	//   softskillTrainer = "Divya K";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static String getTechTrainer() {
		return techTrainer;
	}

	public static void setTechTrainer(String techTrainer) {
		Student.techTrainer = techTrainer;
	}


	public static void setSoftskillTrainer(String softskillTrainer) {
		Student.softskillTrainer = softskillTrainer;
	}

	public static String getCollegename() {
		return Collegename;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", branch=" + branch + " , techTrainer= "+ techTrainer +", SoftskillTrainer = " +softskillTrainer +", College= "+ Collegename+ "]";
	}

	
	
	
	
}

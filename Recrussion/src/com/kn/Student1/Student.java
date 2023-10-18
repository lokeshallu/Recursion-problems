package com.kn.Student1;

public class Student {
	
	int id;
	String Name;
	String Gender;
    String Branch;
    public void study() {
    	System.out.println("Studying...........");
    }
	public Student(int id, String name, String gender, String branch) {
		this.id = id;
		this.Name = name;
		this.Gender = gender;
		this.Branch = branch;
	}
    

}

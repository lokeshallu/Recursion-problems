package com.kn.student;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"ramya",88,"female");
		System.out.println("<<<<------------>>>>>");
		System.out.println("rollnumber :"+s1.getRollnumber());
		System.out.println("name       :"+s1.getName());
		System.out.println("marks      :"+s1.getMarks());
		System.out.println("gender     :"+s1.getGender());
		
		s1.setRollnumber(2);
		s1.setName("ram");
		s1.setMarks(89);
		s1.setGender("male");
		System.out.println();
	 
		System.out.println("<<<<<---------->>>>>");
		System.out.println("rollnumber :"+s1.getRollnumber());
		System.out.println("rollnumber :"+s1.getName());
		System.out.println("rollnumber :"+s1.getMarks());
		System.out.println("rollnumber :"+s1.getGender());
		

	}

}

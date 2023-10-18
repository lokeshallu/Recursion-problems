package com.kn.Student1;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of students");
	
	int num = scan.nextInt();
	
     Student []arr = new Student[num];
     
     for(int i=0;i<=arr.length-1;i++) {
    	 System.out.println("id"+(i+1));
    	 int id =scan.nextInt();
    	 System.out.println("Name"+(i+1));
    	 String Name =scan.next();
    	 System.out.println("Gender"+(i+1));
    	 String Gender =scan.next();
    	 System.out.println("Branch"+(i+1));
    	 String Branch =scan.next();
    	 
    	 arr[i]=new Student(id, Name, Gender, Branch);
    	 
     }
     
		Studentsearchsort.studentarray(arr);
		
		System.out.println("Enter to name to search");
		String keyName = scan.next();
		boolean res =Studentsearchsort.searchbyname(arr,keyName);
		if(res==true) {
			System.out.println("yes in the list");
		}else {
			System.out.println("! not in the list");
		}
		
		System.out.println("if want to sort by array by id entre true else false: ");
		
		boolean want = scan.nextBoolean();
//		System.out.println("if want to sort by array by id entre true else false: ");
		
		if(want==true) {
			System.out.println("enter the kayid");
//			int keyvalue =scan.nextInt();
		    Studentsearchsort.sortbyid(arr);
		    Studentsearchsort.studentarray(arr);
		    
		
	}
		
		
		
		
		
	}

}

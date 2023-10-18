package com.kn.Student1;

public class Studentsearchsort {

	public static void studentarray(Student[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].id+" | "+arr[i].Name+" | "+arr[i].Gender+" | "+arr[i].Branch);
		}		
	}

	 static boolean searchbyname(Student[] arr, String keyName) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].Name.equals(keyName)) {
				return true;
			}
			}
		
		return false;
			
		
	}

	public static void sortbyid(Student[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].id>arr[j+1].id) {
				   Student	temp =arr[j];
					         arr[j]=arr[j+1];
					         arr[j+1]=temp;
					          
					         
				
				}
			}
		}
		
		
	}

}

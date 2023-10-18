package com.kn.factorialrecression;

import java.util.Scanner;

public class FactorialDemo {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the factorial value ");
		
//		 input  taking from usager
		int n = scan.nextInt();
		
//		object  creation for FactorialDemo
		Factorial f1 = new Factorial();
//		 method call for Factorial
		int res = f1.fact(n);
//	    result	
		System.out.println("factorial of "+ n + " is :" +res);
		
	}

}

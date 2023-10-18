package com.kn.gcd;

import java.util.Scanner;

public class GcdDemo {

	public static void main(String[] args) {
	Scanner	scan=new Scanner(System.in);
	System.out.println("Enter the n1 value :");
	int n1 = scan.nextInt();
	System.out.println("Enter the n2 value  :");
	int n2 = scan.nextInt();
	
	Gcd g = new Gcd();
	
	int res = g.gcd(n1,n2);
	
	System.out.println( "Gcd of "+n1+ " && "+n2+" is : "+res);
		

	}

}

package com.kn.fabinoseries;

import java.util.Scanner;

public class FabiniseriesDemo {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
	   int n = scan.nextInt();
	  
	  Fabiniseries fab = new Fabiniseries();
	  int out =fab.fabiniseries(n);

	}

}

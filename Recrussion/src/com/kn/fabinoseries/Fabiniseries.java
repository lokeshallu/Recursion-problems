package com.kn.fabinoseries;

public class Fabiniseries {
	public int fabiniseries(int n) {
		if(n<=1) {
			return n;
		}else {
			
		}
		return fabiniseries(n-1)+ fabiniseries(n-2);
		
	}

}

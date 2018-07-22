package com.bybo.util;

public class Math {
	
	public static int factorial(int n){
		if(n <= 1){
			return n;
		} else {
			return n * factorial(n - 1);
		}
	}

}

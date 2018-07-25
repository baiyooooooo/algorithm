package com.bybo.util;

import static java.lang.System.out;

public class Print {
	
	public static void printArray(int[] sources) {
		for(int source : sources) {
			out.print(source + " ");
		}
		out.print("\n");
	}
	
	public static void printArray(String[] sources) {
		for(String source : sources) {
			out.print(source + " ");
		}
		out.print("\n");
	}
	
	public static void printArray(int[][] sources) {
		for(int[] source : sources) {
			Print.printArray(source);
			out.print("\n");
		}
	}

}

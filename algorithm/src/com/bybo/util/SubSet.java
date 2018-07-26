package com.bybo.util;

import java.util.HashSet;

public class SubSet {
	
	public static HashSet<HashSet<Integer>> getSubSet(int[] set){
		HashSet<HashSet<Integer>> result = new HashSet<HashSet<Integer>>();
		int size = set.length;
		int length = size == 0 ? 0 : 1 << size;
		
		for(int i = 0; i < length; i++) {
			HashSet<Integer> subSet = new HashSet<Integer>();
			int index = i;
			for(int j = 0; j < size; j++) {
				if((index & 1) == 1) {
					subSet.add(set[j]);
				}
				index >>= 1;
			}
			result.add(subSet);
		}
		
		SubSet.printSet(result);
		
		return result;
	}
	
	private static void printSet(HashSet<HashSet<Integer>> set) {
		for(HashSet<Integer> sub : set) {
			for(Integer integer : sub) {
				System.out.print(integer + " ");
			}
			System.out.println("");
		}
	}

}

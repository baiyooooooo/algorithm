package com.bybo.entrance;

import com.bybo.search.BinarySearch;
import com.bybo.string.ArrangingCombination;

public class MainApp {
	
	public static void main(String[] args) {
//		testBinarySearch();
		System.out.println(ArrangingCombination.combine("bybo").size());
		ArrangingCombination.combine("bybo").forEach(str -> {
			System.out.println(str);
		});
	}
	public static void testBinarySearch() {
		int[][] sources = {{1,5,7,8,10,15,50},
						{2, 6, 8, 10, 23, 88, 150},
						{4, 34, 43, 77, 345, 1234, 2312},
						{8, 44, 55, 88, 999, 2132, 3245},
						{10, 55, 77, 444, 1000, 3100, 4421},
						{15, 59, 88, 565, 2100, 3300, 4862}};
		int target = 455;
		BinarySearch.findIndex(sources, target);
	}

}

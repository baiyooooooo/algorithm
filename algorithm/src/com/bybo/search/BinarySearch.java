package com.bybo.search;

import com.bybo.util.Print;

public class BinarySearch {

	public static int findIndex(int[] sources, int target) {
		int start = 0;
		int middle = 0;
		int end = sources.length - 1;

		while (start <= end) {
			middle = start + (end - start) / 2;
			if (sources[middle] == target) {
				return middle;
			} else if (sources[middle] > target) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}

	public static void findIndex(int[][] sources, int target) {

		int rowLength = sources.length;
		boolean findIndex = false;

		for (int i = 0; i < rowLength; i++) {
			int index = BinarySearch.findIndex(sources[i], target);
			if (index != -1) {
				Print.printArray(new int[] { i, index });
				findIndex = true;
			}
		}
		if (!findIndex) {
			System.out.println("Not Found");
		}
	}

}

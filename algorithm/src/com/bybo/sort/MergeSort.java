package com.bybo.sort;

import com.bybo.util.Print;

public class MergeSort {
	
	public static void mergeSort(int arr[]) {

		System.out.println("Before merge sort...");
		Print.printArray(arr);
		
		long startTime = System.currentTimeMillis();

		MergeSort.sort(arr, 0, arr.length - 1);
		
		System.out.println("Merge sort spends " + ( System.currentTimeMillis() - startTime ));
		System.out.println("After merge sort...");
		Print.printArray(arr);
	}
		
	private static void sort(int arr[], int low, int high) {
		if(low < high) {
			int pivot = (low + high) / 2;
			MergeSort.sort(arr, low, pivot);
			MergeSort.sort(arr, pivot + 1, high);
			MergeSort.merge(arr, low, pivot, high);
		}
	}
	
	private static void merge(int arr[], int low, int pivot, int high) {
		System.out.println(low + " " + pivot + " " + high);
		int[] tmp = new int[arr.length];
		int start = low;
		int mid = pivot + 1;
		int tmpIndex = low;
		while(start <= pivot && mid <= high) {
			if(arr[low] <= arr[mid]) {
				tmp[start++] = arr[low++];
			} else {
				tmp[start++] = arr[mid++];
			}
		}
		while(start <= pivot) {
			tmp[start++] = arr[low++];
		}
		while(mid <= high) {
			tmp[start++] = arr[mid++];
		}
		
		while(tmpIndex <= high) {
			arr[tmpIndex] = tmp[tmpIndex++];
		}
	}

}

package com.bybo.sort;

import java.util.Stack;

import com.bybo.util.Print;

public class QuickSort {
	
	public static void quickSortWithRecursive(int arr[]) {
		System.out.println("Before quick sort with Recursive...");
		Print.printArray(arr);
		long startTime = System.currentTimeMillis();
		quickSortRecursive(arr, 0, arr.length - 1);
		System.out.println("Recursive spends " + ( System.currentTimeMillis() - startTime ));
		System.out.println("After quick sort with Recursive...");
		Print.printArray(arr);
	}
	
	public static void quickSortWithoutRecursive(int arr[]) {
		System.out.println("Before quick sort with Stack...");
		Print.printArray(arr);
		long startTime = System.currentTimeMillis();
		quickSortNoRecursive(arr, 0, arr.length - 1);
		System.out.println("Stack spends " + ( System.currentTimeMillis() - startTime ));
		System.out.println("After quick sort with Stack...");
		Print.printArray(arr);
	}
	
	private static void quickSortRecursive(int arr[], int low, int high) {
		if(low < high) {
			int pivot = QuickSort.partition(arr, low, high);
			quickSortRecursive(arr, low, pivot - 1);
			quickSortRecursive(arr, pivot + 1, high);
		}
	}
	
	private static void quickSortNoRecursive(int arr[], int low, int high) {
		Stack<Integer> indexStack = new Stack<Integer>();
		if(low < high) {
			int pivot = QuickSort.partition(arr, low, high);
			if(low < pivot - 1) {
				indexStack.push(low);
				indexStack.push(pivot - 1);
			}
			if(pivot + 1 < high) {
				indexStack.push(pivot + 1);
				indexStack.push(high);
			}
			while(!indexStack.isEmpty()) {
				int end = (int) indexStack.pop();
				int start = (int) indexStack.pop();
				pivot = QuickSort.partition(arr, start, end);
				if(start < pivot - 1) {
					indexStack.push(start);
					indexStack.push(pivot - 1);
				}
				if(pivot + 1 < end) {
					indexStack.push(pivot + 1);
					indexStack.push(end);
				}
			}
		}
	}
	
	private static int partition(int arr[], int low, int high) {
		// Use first one in array as pivot
		int pivot = arr[low];
		while(low < high) {
			while(low < high && arr[high] >= pivot) {
				--high;
			}
			arr[low] = arr[high];
			
			while(low < high && arr[low] <= pivot) {
				++low;
			}
			arr[high] = arr[low];
		}
		arr[low] = pivot;
		return low;
	}

}

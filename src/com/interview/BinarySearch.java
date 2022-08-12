package com.interview;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 25, 7, 9, 89, 90, 120, 34, 6 };
		int search = 34;
		sort(arr);
		System.out.println(Arrays.toString(arr));
		int first = 0;
		int last = arr.length - 1;
		int s1 = binarySearch(arr, first, last, search);
		System.out.println((s1 == -1) ? "not found " : "found at index : " + s1);
	}

	static int binarySearch(int[] arr, int first, int last, int search) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (search == arr[mid]) {
				return mid;
			}
			if (search > arr[mid]) {
				return binarySearch(arr, mid + 1, last, search);
			}
			if (search < arr[mid])
				return binarySearch(arr, first, mid - 1, search);
		}
		return -1;
	}
	
	static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1])
				{
					arr[j] = arr[j]+arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}

}

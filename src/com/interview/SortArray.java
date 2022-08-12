package com.interview;

public class SortArray {
	public static void main(String[] args) {
		int[] array = { 2, 14, 51, 7, 8, 9, 10 };
		printArray(array);
		System.out.println("After sort array===========");
		bubbleSort(array, array.length);
		printArray(array);
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void bubbleSort(int[] arr, int size) {
		if(size == 1) {
			return;
		}
		for(int i=1; i<size-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bubbleSort(arr, size-1);
	}

	static void sort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

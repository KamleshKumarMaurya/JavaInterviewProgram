package com.interview;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = { 2, 14, 51, 7, 8, 9, 10 };
		printArray(array);
		reverse2(array, 0, array.length - 1);
		printArray(array);
//		reverse3(array);
//		printArray(array);
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void reverse1(int[] array, int start, int end) {
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	static void reverse2(int[] arr, int start, int end) {
		int temp;
		if (start >= end) {
			return;
		}
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse2(arr, start + 1, end - 1);
	}
	
	static void reverse3(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-1-i] = temp;
		}
	}

}

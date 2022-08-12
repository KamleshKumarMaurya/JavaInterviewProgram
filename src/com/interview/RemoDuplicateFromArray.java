package com.interview;

import java.util.Arrays;

public class RemoDuplicateFromArray {

	public static int removeduplicates(int a[], int n) {
		int[] temp = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j++] = a[n-1];
		//System.out.println(Arrays.toString(temp));
		for(int i=0; i<j; i++) {
			a[i] = temp[i];
		}
		return j;
	}
	
	static void sort(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1,2, 1, 2, 2, 2,3, 5,5 ,4,3};
		sort(a);
		int n = a.length;

		n = removeduplicates(a, n);

		// Printing The array elements
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}

package com.interview;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int a[] = { 1,2, 1, 2, 2, 2,3, 5,5 ,4,3};
		Arrays.sort(a);
		remove(a);
	}
	static void remove(int[] arr) {
		int[] newArr = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				newArr[j] = arr[i];
				j++;
			}
		}
		newArr[j++] = arr[arr.length-1];
		for(int i=0; i<j; i++) {
			System.out.println(newArr[i]);
		}
	}

}

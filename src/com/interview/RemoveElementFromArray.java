package com.interview;

import java.util.Arrays;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int index = 3;
		System.out.println(Arrays.toString(arr));
		int[] newArray = remove(arr, index);
		System.out.println(Arrays.toString(newArray));
	}
	
	static int[] remove(int[] array, int index) {
		int[] newArray = new int[array.length-1];
		int j=0;
		for(int i=0; i<array.length;i++) {
			if(array[i] == 3) {
				continue;
			}
			newArray[j++] = array[i];
		}
		return newArray;
	}

}

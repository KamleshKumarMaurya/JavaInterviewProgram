package com.Java_2002_Logical;

import java.util.Arrays;

public class RevserArray {
	public static void main(String[] args) {
		String[] arr = {"hello","to","all","abc","test"};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(String[] arr) {
		if(arr.length == 0) {
			return;
		}
		for(int i=0; i<arr.length/2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

}

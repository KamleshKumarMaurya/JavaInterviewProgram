package com.array;

import java.util.Arrays;

public class M1 {
	public static void main(String[] args) {
		int[] array = {2,3,56,74,2,566,2};
		System.out.println(Arrays.toString(array));
		System.out.println("array size : "+array.length);
		System.out.println("Printing array using for-loop ============");
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Printing array using for-each-loop ============");
		for(int element : array)
		{
			System.out.println(element);
		}
	}

}

package com.demo;

/*
 * Given an array of non-duplicating numbers from 1 to n where one number is missing, 
 * write an efficient java program to find that missing number.
 */

public class Test22 {
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 6,3 };
		int missingNumber = findMissingNumber(array);
		System.out.println(missingNumber);
	}

	private static int findMissingNumber(int[] array) {
		int n = array.length;
		int sum = ((n+1) * (n+2))/2;
		int actualSum = 0;
		for(int i=0; i<array.length; i++)
		{
			//System.out.println(sum);
			actualSum += array[i];
		}
		return  sum - actualSum;
	}

}

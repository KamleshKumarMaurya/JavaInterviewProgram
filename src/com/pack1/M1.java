package com.pack1;

import java.util.Arrays;

public class M1 {

	public static void main(String[] args) {

		int[] array = {3,5,67,3,32,1,34,6};
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j] > array[j+1])
				{
					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] - array[j+1]; 
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}

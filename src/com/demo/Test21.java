package com.demo;

import java.util.Arrays;

public class Test21 {
	
	static void sort(char[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] > array[j])
				{
					char temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		sort(c1);
		sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("anagram");
		}else
		{
			System.out.println("not");
		}
	}

}

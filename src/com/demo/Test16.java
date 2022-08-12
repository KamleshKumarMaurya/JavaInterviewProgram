package com.demo;

import java.util.Arrays;
import java.util.Scanner;

//check if second string can be achieved by jumbling the first String
//ex== Funeral
//	   Real Fun
//o/u = yes
public class Test16 {
	
	static void sort(char[] array)
	{
		for(int i=0; i<array.length-1; i++)
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
	
	static String remove(String s1)
	{
		String s2 ="";
		for(int i=0; i<s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			if(c1 >= 'a' && c1<='z')
			{
				s2 = s2+c1;
			}
		}
		return s2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter second String");
		String s2 = sc.nextLine().toLowerCase();
		String s3 = remove(s1);
		String s4 = remove(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		char[] ch1 = s3.toCharArray();
		char[] ch2 = s4.toCharArray();
		sort(ch1);
		sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("Not");
		}
	}
}

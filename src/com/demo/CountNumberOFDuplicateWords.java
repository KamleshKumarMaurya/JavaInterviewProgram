package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOFDuplicateWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words");
		String s1 = sc.nextLine();
		countWord(s1);
	}
	
	public static void countWord2(String s1)
	{
		String[] s2 = s1.split("\\s+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<s2.length; i++) {
			if(map.containsKey(s2[i])) {
				int count = map.get(s2[i]);
				map.put(s2[i], count+1);
			}else
			{
				map.put(s2[i], 1);
			}
		}
		System.out.println(map);
	}
	
	public static void countWord(String s1)
	{
		String[] array = s1.split("\\s+");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int count = 1;
		String prev = array[0], currentword;
		for (int i = 1; i < array.length; i++)
		{
			currentword = array[i];
			if (currentword.equals(prev)) 
			{
				count++;
			} 
			else {
				System.out.println(prev + ":" + count);
				prev = currentword;
				count = 1;
			}
		}
		System.out.println(prev +":"+count);
	}

}

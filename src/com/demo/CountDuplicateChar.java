package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountDuplicateChar {
	public static void main(String[] args) {
		String s1 = "Hellotoall";
		findOccuranceOfChar(s1);
	}
	
	public static void findOccuranceOfChar2(String s1) {
		char[] s2 = s1.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s2.length; i++)
		{
			if(map.containsKey(s2[i])) {
				int temp = map.get(s2[i]);
				map.put(s2[i], temp+1);
			}
			else
			{
				map.put(s2[i], 1);
			}
		}
		map.forEach((o1,o2) -> System.out.println(o1+":"+o2));
		System.out.println("After sort======");
		TreeMap<Character,Integer> tset = new TreeMap<Character,Integer>(map);
		tset.forEach((o1,o2) -> System.out.println(o1+":"+o2));
		
		
	}
	
	
	public static void findOccuranceOfChar(String s1)
	{
		char[] s2 = s1.toCharArray();
		Arrays.sort(s2);
		int count=1;
		char prev = s2[0], currentchar;
		for(int i=1; i<s2.length; i++)
		{
			currentchar = s2[i];
			if(currentchar == prev) {
				count++;
			}else
			{
				System.out.println(prev +":"+count);
				prev = currentchar;
				count=1;
			}
		}
		System.out.println(prev+":"+count);
	}

}

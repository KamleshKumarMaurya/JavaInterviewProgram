package com.demo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

//find occurrences of char in given string

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		map.forEach((o1,o2) -> System.out.println(o1+" => "+o2));
//		Set<Entry<Character,Integer>> set = map.entrySet();
//		for(Entry<Character,Integer> obj : set)
//		{
//			System.out.println(obj.getKey()+" : "+obj.getValue());
//		}
	}

}

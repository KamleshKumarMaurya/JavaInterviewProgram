package com.interview;

import java.util.HashMap;
import java.util.Map;

public class OcuranceOfChar {
	public static void main(String[] args) {
		String s1 = "aHello to alala";
		s1 = s1.replaceAll("\\s+", "");
		occurance(s1);
	}
	static void occurance(String s1) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			if(map.containsKey(s1.charAt(i))) {
				int count = map.get(s1.charAt(i));
				map.put(s1.charAt(i), count+1);
			}else
			{
				map.put(s1.charAt(i), 1);
			}
		}
		//find max char in given string
		int max = 0;
		char c = ' ';
		for(Map.Entry<Character, Integer> obj : map.entrySet()) {
			if(max < obj.getValue()) {
				max = obj.getValue();
				c = obj.getKey();
			}
		}
		System.out.println(map);
		System.out.println(c);
	}
	
	

}

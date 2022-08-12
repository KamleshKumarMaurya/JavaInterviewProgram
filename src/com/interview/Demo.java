package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		String s1 = "abbbacc";
		String s2 = frequencyChar(s1);
		System.out.println(s2);
	}
	static String frequencyChar(String s1) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
		}
		String s2 ="";
		String s3="";
		for(Map.Entry<Character, Integer> obj : map.entrySet()) {
			s2 += obj.getKey();
			s3 += obj.getValue();
		}
		String s4 = s2+"-"+s3;
		return s4;
	}
}

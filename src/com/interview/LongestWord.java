package com.interview;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		longestWordIn2(s1);
		
	}
	
	static void longestWordIn2(String s1) {
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		String max = s1.substring(fromIndex, toIndex);
		while(toIndex != -1) {
			if(max.length() <  s1.substring(fromIndex, toIndex).length()) {
				max = s1.substring(fromIndex, toIndex);	
			}
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ',fromIndex);
		}
		if(max.length() < s1.substring(fromIndex).length()) {
			max = s1.substring(fromIndex);
		}
		System.out.println(max);
	}
	
	static void longestWordIn(String s1) {
		String[] array = s1.split("\\s+");
		String max = array[0];
		for(int i=1; i<array.length; i++) {
			if(max.length() < array[i].length()) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}

package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/*
 In this HackerRank Java Anagrams problem in the java programming language, 
 you need to complete the function in the editor. If a and b are case-insensitive anagrams,
 print "Anagrams"; otherwise, print "Not Anagrams" instead.
 */

public class M2 {
	
	public static void sort(char[] c1) {
		for(int i=0; i<c1.length; i++) {
			for(int j=i+1; j<c1.length; j++) {
				if(c1[i] > c1[j]) {
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first");
		String s1 = sc.next();
		System.out.println("Enter Second");
		String s2 = sc.next();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		//Arrays.sort(c1); // you can use Arrays sort method
		sort(c1);
		sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT ANAGRAM");
		}
	}

}

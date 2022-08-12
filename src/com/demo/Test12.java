package com.demo;

import java.util.Scanner;
//remove vowels from given string
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine().toLowerCase();
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i)=='i' || s1.charAt(i) == 'o' || s1.charAt(i)=='u' || s1.charAt(i) == 'e' ) {
				
			}else
			{
				s2 += s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}

package com.interview;

import java.util.Scanner;
//count special character in  given string
public class CountSpeicalCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String ");
		String s1 = sc.next();
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			if((s1.charAt(i) >= 'a') && (s1.charAt(i) <= 'z') || 
				(s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z') ||
				(s1.charAt(i) >= '0') && (s1.charAt(i) <= '9') ) {
			}else {
				count++;
			}
		}
		System.out.println(count);
	}

}

package com.demo;

import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		String s2 ="";
		for(int i=0; i<s1.length(); i++) {
			char c1 = s1.charAt(i);
			if(s2.indexOf(c1) < 0) {
				s2 += c1;
			}
		}
		System.out.println(s2);
	}

}

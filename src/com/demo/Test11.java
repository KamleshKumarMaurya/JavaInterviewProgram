package com.demo;

import java.util.Scanner;

//count the number of vowels
public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine().toLowerCase();
		int count =0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i)=='i' || s1.charAt(i) == 'o' || s1.charAt(i)=='u' || s1.charAt(i) == 'e' ) {
				count++;
			}
		}
		System.out.println(count);
	}
}

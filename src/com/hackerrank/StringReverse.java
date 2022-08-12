package com.hackerrank;

import java.util.Scanner;

/*
 int this HackerRank Java string Reverse problem in the java programming language you have Given a string A, 
 print Yes if it is a palindrome, print No otherwise.
 
 */

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		System.out.println(s1.equals(new StringBuffer(s1).reverse().toString()) ? "YES" : "NO");
		
//		StringBuffer s2 = new StringBuffer(s1).reverse();
//		if(s1.equals(s2.toString())){
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
		
	}
	static String revrse(String s2) {
		if(s2.length() == 0) {
			return "";
		}
		return s2.charAt(s2.length()-1)+revrse(s2.substring(0, s2.length()-1));
	}

}

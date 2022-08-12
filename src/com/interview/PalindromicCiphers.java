package com.interview;

import java.util.Scanner;

public class PalindromicCiphers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int");
		int x = sc.nextInt();
		while(x --> 0) {
			String s1 = sc.next();
			String temp = "";
			long num =0;
			
			for(int i=s1.length()-1; i>=0;i--) {
				temp += s1.charAt(i);
			}
			if(s1.equals(temp)) {
				System.out.println("Palindrome");
			}else
			{
				for(int i=0; i<s1.length(); i++) {
					num *=s1.charAt(i)-96;
				}
			}
			System.out.println(num);
		}
	}

}

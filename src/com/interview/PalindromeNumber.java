package com.interview;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num =sc.nextInt();
		int num1 = reverse(num);
		if( num1 == num) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	static int reverse(int num) {
		int rever = 0;
		while(num > 0) {
			int digit = num % 10;
			rever = rever * 10 + digit;
			num = num /10;
		}
		return rever;
	}

}

package com.pack1;

public class M2 {
	public static void main(String[] args) {
		int num = 23456;
		int rev = 0;
		while(num > 0)
		{
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}

}

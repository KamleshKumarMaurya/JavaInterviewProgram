package com.variable;

public class M2 {
	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		System.out.println(num);
		while(num > 0)
		{
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}

}

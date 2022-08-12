package com.variable;

public class M1 {
	public static void main(String[] args) {
		int num = 2345;
		int sum =0;
		int count =0;
		while(num != 0)
		{
			int digit = num % 10;
			sum =sum+ digit;
			num = num / 10;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}

package com.interview;

public class M5 {
	public static void main(String[] args) {
		int num = 256;
		int sum =0;
		while(num > 0) {
			int digit = num %10;
			sum += digit;
			num = num /10;
		}
		System.out.println(sum);
	}

}

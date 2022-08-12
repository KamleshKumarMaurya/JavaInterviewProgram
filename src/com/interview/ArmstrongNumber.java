package com.interview;

import java.util.Scanner;
/*
 
 	1: 1^1 = 1

	2: 2^1 = 2

	3: 3^1 = 3

	153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153

	125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

	1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
  
 */


public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente number");
		int num = sc.nextInt();
		System.out.println(check(num));
//		for(int i=2; i<=num; i++) {
//			if(checkWithOutMath(i)) {
//				System.out.print(i+",");
//			}
//		}
	}
	static boolean check(int num) {
		boolean b1 = false;
		int num1 = num;
		int digit =0, first=0,sum=0;
		while(num1 > 0) {
			num1 = num1 / 10;
			digit++;
		}
		num1 = num;
		while(num1 > 0) {
			first = num1 % 10;
			sum += Math.pow(first, digit);
			num1 = num1 /10;
		}
		if(num == sum) {
			b1 = true;
		}
		return b1;
		
	}
	
	static boolean checkWithOutMath(int num) {
		boolean b = false;
		int num1 = num;
		int count=0;
		while(num1 > 0) {
			num1 = num1 / 10;
			count++;
		}
		num1 = num;
		int sum =0;
		while(num1 > 0) {
			int digit = num1 % 10;
			int multi=1;
			for(int i=1; i<=count; i++) {
				multi = multi * digit;
			}
			sum += multi;
			num1 = num1 / 10;
		}
		if(num == sum) {
			b = true;
		}
		return b;
	}

}

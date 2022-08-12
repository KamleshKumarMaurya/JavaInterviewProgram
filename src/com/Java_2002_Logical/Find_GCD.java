package com.Java_2002_Logical;

import java.util.Scanner;

//find greatest common divisor

public class Find_GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number ");
		int num2 = sc.nextInt();
		int gcd = findGCD(num1, num2);
		System.out.println("GCD for "+num1 +" and "+num2+" = "+gcd);
	}
	
	static int findGCD(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1% num2);
	}

}

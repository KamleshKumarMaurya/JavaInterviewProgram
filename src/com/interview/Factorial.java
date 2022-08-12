package com.interview;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num =sc.nextInt();
		int fact=1;
		for(int i=1; i<=num;i++) {
			fact *= i;
		}
		System.out.println(fact);
		//System.out.println(factorialNum(num));
	}
	static int factorialNum(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorialNum(--num);
	}

}

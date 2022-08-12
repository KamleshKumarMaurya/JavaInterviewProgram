package com.demo;

import java.util.Scanner;

public class Test5 {
	static int average(int a, int n)
	{
		int sum = 0;
		for(int i=a; i<=a*n; i +=a)
		{
			sum += i;
		}
		return sum/n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the number of multiple");
		int n = sc.nextInt();
		int avg = average(a, n);
		System.out.println("Average : "+avg);
	}

}

package com.demo;
//you are given two integer l and r you have to find the counts of all the integer between l and r 
//both inclusive which sum of digit is divisible by k;

import java.util.*;

public class Test2 {
	public static int sum(int n)
	{
		int sum = 0;
		while(n>0)
		{
			sum += n%10;
			n = n/10;
		}
		return sum;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting the digit ");
		int l = sc.nextInt();
		System.out.println("Enter ending the digit ");
		int r = sc.nextInt();
		System.out.println("sum of digit divisible by this number ");
		int k = sc.nextInt();
		int count=0;
		for(int i=l; i<=r; i++)
		{
			if(sum(i)%k == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
/*
 * Example==
 * enter 5
 * 		 10
 * 		 2
 *   o/u = 2 b/s b/w 5 and 10 numbers are= 5,6,7,8,9,10 = here 6 and 8 divisible by 2 not 10 b/s the sum of digit 10 is 1 so only 2 is output
 * 
 */

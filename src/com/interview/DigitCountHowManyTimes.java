package com.interview;

import java.util.Scanner;

public class DigitCountHowManyTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println("Enter digit to find how many times comes");
		int find = sc.nextInt();
		int count = 0;
		while(num > 0) {
			if(find == num%10) {
				count++;
			}
			num = num /10;
		}
		System.out.println(find +" comes : "+count+" no of times");
				
	}

}

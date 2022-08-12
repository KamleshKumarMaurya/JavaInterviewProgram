package com.string;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//System.out.println("enter number");
		int num  = 4;
		System.out.println(factorial(num));
	}
	static int factorial(int count)
	{
		int fact=1;
		for(int i=count; i>=1; i--)
		{
			fact *= i;
		}
		return fact;
		
	}

}

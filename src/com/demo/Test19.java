package com.demo;

import java.util.Scanner;

import java.util.*;
class Test19 
{
	static boolean checkLeapYear(int year)
	{
		if(year > 1000)
		{
			if(year % 400 == 0 || year % 100 != 0)
			{
				return false;
			}
			if(year % 4 == 0)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println(checkLeapYear(year)?"Leap Year":"Not laep year");
	}
	
}

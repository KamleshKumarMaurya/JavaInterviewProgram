package com.demo;

import java.util.Scanner;

//counting number of character in given string
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		System.out.println("enter char to find");
		char c = sc.next().charAt(0);
		int count =0 ;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i) == c)
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("char is not avaliable");
		}
	}

}

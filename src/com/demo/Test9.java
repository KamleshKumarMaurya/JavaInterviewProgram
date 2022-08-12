package com.demo;

import java.util.Scanner;

//count spaces in string
public class Test9 {
	static int countSpace(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			char c1 = s.charAt(i);
			if(c1 == ' ')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		//String s1 = "Hello to all java   ";
		System.out.println(countSpace(s1));
	}

}

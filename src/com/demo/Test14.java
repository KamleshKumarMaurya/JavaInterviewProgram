package com.demo;

import java.util.Scanner;

//check String is Pangram or not
//The string is called a pangram if it contains all the alphabets from a to z or A to Z, ignoring the case sensitivity.
public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine().toLowerCase();
		int count =0;
		for(int i=0; i<s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			if(c1 >= 'a' || c1<='z')
			{
				count++;
			}
		}
		if(count >= 26)
		{
			System.out.println("Pangram");
		}else
		{
			System.out.println("Not pangram");
		}
	}

}

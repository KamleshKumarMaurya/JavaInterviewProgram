package com.demo;

import java.util.Scanner;
//count number of special case ,lower case,upper case,number in given string
/*
 * ex===
 * Enter string
	KamLesH@$%1234
	===
	UpperCase: 3
	LowerCase: 4
	Number: 4
	SpecialCharecter: 3
 */
public class Test13 {
	static void count(String s1)
	{
		int ucc=0,lcc=0,nc=0,sc=0;
		for(int i=0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(c >= 'A' && c <= 'Z')
			{
				ucc++;
			}else if(c >= 'a' && c <= 'z')
			{
				lcc++;
			}else if(c >= '1' && c <= '9')
			{
				nc++;
			}else
			{
				sc++;
			}
		}
		System.out.println("UpperCase: "+ucc); 
		System.out.println("LowerCase: "+lcc);
		System.out.println("Number: "+nc);
		System.out.println("SpecialCharecter: "+sc);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.next();
		count(s1);
	}

}

package com.demo;

import java.util.Scanner;

//count number of vowel
public class Test6 {
	
	static int vowel(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			s = s.toLowerCase();
			char c = s.charAt(i);
			if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		int vowels = vowel(s);
		System.out.println("Number of vowels :"+vowels);
	}

}

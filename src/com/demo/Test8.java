package com.demo;

import java.util.Scanner;
//reverse each word of String
public class Test8 {
	static String reverse(String s1)
	{
		if(s1.length() == 0)
		{
			return "";
		}
		return s1.charAt(s1.length()-1) + reverse(s1.substring(0, s1.length()-1));
	}
	
	static void reverseANother(String s1)
	{
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev += s1.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		String[] arr = s1.split("\\s+");
		String rev = "";
		for(int i=0; i<arr.length; i++)
		{
			rev += reverse(arr[i]+" ");
		}
		System.out.println(rev);
		//reverseANother(s1);
		
		//find palindrome
		System.out.println("Enter String to find palindrome");
		String s2 = sc.next();
		String s3 = reverse(s2);
		if(s2.equals(s3))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palidrome");
		}
	}

}

package com.demo;

import java.util.Scanner;

//
public class Test7 {
	
	static int beautifulBracket(String s)
	{ 
		int bracket =0, count=0;
		char c1 = ' ';
		for(int i=0; i<s.length(); i++)
		{
			c1 = s.charAt(i);
			if(c1 == '(')
			{
				bracket++;
			}else {
				if(bracket<=0){
					count++;
				}else
				{
					bracket--;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bracket");
		String s = sc.next();
		System.out.println(beautifulBracket(s));
	}

}

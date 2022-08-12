package com.demo;

import java.util.HashMap;
import java.util.Scanner;

//find duplicate char in given string
public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		char[] c1 = str.toCharArray();
		int count;
		for(int i=0; i<c1.length; i++)
		{
			count = 1;
			for(int j=i+1; j<c1.length; j++)
			{
				if(c1[i] == c1[j] && c1[i] != ' ')
				{
					count++;
					c1[j] = '0';
				}
			}
			if(count > 1 && c1[i] != '0')
			{
				System.out.println(c1[i]);
			}
		}
	}

}

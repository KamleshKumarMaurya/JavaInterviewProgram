package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/*
 n this HackerRank java String Tokens problem in the java programming language you have Given a string, S, 
 matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 We define a token to be one or more consecutive English alphabetic letters. 
 Then, print the number of tokens, followed by each token on a new line.
 */


public class StringTokenProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first");
		String s1 = sc.nextLine();
		String[] array = s1.split("[^a-zA-Z]");
		int token = 0;
		for(int i=0; i<array.length;i++) {
			if(array[i].length() > 0) {
				token++;
			}
		}
		System.out.println(token);
		
		for(int i=0; i<array.length;i++)
			if(array[i].length() > 0)
				System.out.println(array[i]);
	}

}

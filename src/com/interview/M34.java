package com.interview;

import java.util.Scanner;

//remove all white spaces

public class M34 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s1 ="btm is    java      123      xyz          test"; 
		System.out.println("Enter a line of string");
		String s1 = sc.nextLine();
		int fromIndex =0;
		int toIndex = s1.indexOf(' ');
		String words="";
		while(toIndex != -1) {
			words += s1.substring(fromIndex, toIndex);
			toIndex = charSpaceCount(s1, toIndex);
			fromIndex = toIndex+1;
			toIndex = s1.indexOf(' ',fromIndex);
		}
		words += s1.substring(fromIndex);
		System.out.println(words);
	}
	
	static int charSpaceCount(String s1, int toIndex) {
		char c = s1.charAt(toIndex+1);
		while(c == ' ') {
			++toIndex;
			c = s1.charAt(toIndex+1);
		}
		return toIndex;
	}

}
	
	
	


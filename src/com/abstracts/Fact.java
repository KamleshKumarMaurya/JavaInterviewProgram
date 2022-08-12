package com.abstracts;

import java.util.Arrays;
import java.util.Scanner;
//print largest word
public class Fact {
	public static void main(String[] args) {
//		 Scanner s = new Scanner(System.in);
//		 System.out.println("Enter worlds");
		 String line = "fun&!!!! time";
		 System.out.println(LongestWord(line));
		 String s1 = "B1hello_";
		 char c2 = s1.charAt(0); 
		 if(Character.isLetter(c2) || Character.isDigit(c2) || c2 == '_') {
			 System.out.println("true");
		 }
		 char c3 = s1.charAt(s1.length()-1);
		 if(! (c3 == '_')) {
			 System.out.println("true");
		 }
	}
	static String LongestWord(String sen) {
		String[] str = sen.split("[^a-z^A-Z]");
		String longest = "";
		for(int i=0; i<str.length; i++) {
			if(longest.length() < str[i].length()) {
				longest = str[i];
			}
		}
		return longest;
	}
	

}

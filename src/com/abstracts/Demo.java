package com.abstracts;

public class Demo {
	public static void main(String[] args) {
		String s1 = "I Love Code";
		String[] str = s1.split(" ");
		String s2 ="";
		for(int i=str.length-1; i>=0; i--) {
			s2 += reverse(str[i])+" ";
		}
		System.out.println(s2);
	}
	static String reverse(String s1) {
		if(s1.length() == 0) {
			return"";
		}
		return s1.charAt(s1.length()-1)+reverse(s1.substring(0,s1.length()-1));
	}

}

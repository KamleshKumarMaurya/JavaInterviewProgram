package com.interview;

import java.util.Arrays;

public class MaximumOccuranceChar {
	public static void main(String[] args) {
		 String str = "asample string sael";
		 str = str.replaceAll("\\s+", "");//for ignore white spaces
	        System.out.println("Max occurring character is : " + 
	                            getMaxOccuringChar(str)); 
	}

	static char getMaxOccuringChar(String str) {
		int count[] =new int[127];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max =-1;
		char result=' ';
		for(int i=0; i<str.length();i++)
		{
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
				
		return result;
	}

}

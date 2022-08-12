package com.interview;

import java.util.HashMap;

class A1
{
	int i;
	void print() {
		System.out.println("A1");
	}
}
public class Demo4 extends A1{
	void print() {
		super.print();
		System.out.println("Demo3");
	}
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		String s2 = pangram(s1);
		System.out.println(s2);
	}
	static String pangram(String s1) {
		s1 = s1.replaceAll(" ", "");
		s1 = s1.toLowerCase();
		String s2 = removeDuplicate(s1);
		//System.out.println(s2);
		int count=0;
		char[] c1 = s2.toCharArray();
		for(int i=0; i<c1.length; i++) {
			if(c1[i] >='a' && c1[i] <='z') {
				count++;
			}
		}
		if(count >= 26) {
			return "true";
		}else
		{
			return "false";
		}
	}
	static String removeDuplicate(String s1) {
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(s2.indexOf(c) < 0) {
				s2 += c;
			}
		}
		return s2;
	}

}

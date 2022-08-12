package com.interview;

import java.util.Scanner;

public class DuplicateCar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		System.out.println(removeDuplicaet(s1, s1.length()));
	}
	
	static String removeDuplicaet(String s1,int size) {
		String s2 ="";
		for(int i=0; i<size; i++) {
			char c = s1.charAt(i);
			if(s2.indexOf(c) < 0) {
				s2 += c;
			}
		}
		return s2;
	}

}

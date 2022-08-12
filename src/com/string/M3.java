package com.string;

public class M3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));//true b/s check content of string
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.equals(s4));//true b/s check content of string
	}

}

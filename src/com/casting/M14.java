package com.casting;

public class M14 {
	public static void main(String[] args) {
		int i = 130;
		short s1 = (short) (byte) (short) i;
		System.out.println(s1);
		System.out.println("done");
	}
	
}

package com.casting;

public class M4 {
	public static void main(String[] args) {
		double d = 129.5;
		byte b;
		b =(byte) d;// Explicit Downcasting
		System.out.println(d);//129.5
		System.out.println(b);//-127 b/s range of byte is -128 to +127
	}
}

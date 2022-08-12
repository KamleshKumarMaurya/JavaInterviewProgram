package com.casting;

public class M1 {
	public static void main(String[] args) {
		byte b = 124;
		double d;
		d = b;//AutoUpCasting
		System.out.println(b);//124
		System.out.println(d);//124.0
	}

}
//Converting higher to lower is k/w as implicit or autoUpcasting
//byte<short<int<long<float<double
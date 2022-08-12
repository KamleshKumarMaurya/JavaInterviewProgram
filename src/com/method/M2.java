package com.method;

public class M2 {
	
	int add(int a, int b)
	{
		return a+b;
	}
	long add(int a, long b)
	{
		return a+b;
	}
	double add(int a, float b, double c)
	{
		return a+b+c;
	}
	float add(int a, int b, float c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		M2 m = new M2();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(2, 234));
		System.out.println(m.add(3, 5.5f, 9.5));
		System.out.println(m.add(10, 20, 3.5f));
	}

}

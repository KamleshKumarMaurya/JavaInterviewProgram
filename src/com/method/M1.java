package com.method;
class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	float add(int a, float b)
	{
		return a+b;
	}
	double add(int a, double b, int c)
	{
		return a+b+c;
	}
}
public class M1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(1, 34));
		System.out.println(c.add(1, 3.5f));
		System.out.println(c.add(1, 34.5,5));
		
		
	}

}

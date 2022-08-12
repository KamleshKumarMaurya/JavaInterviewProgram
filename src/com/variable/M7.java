package com.variable;

class Calculator {
	int add(int a, int b)
	{
		return (a + b);
	}
}

public class M7 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int c = c1.add(10, 20);//pass by value
		System.out.println(c);
	}

}

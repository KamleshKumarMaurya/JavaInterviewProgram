package com.encapsulation;

class Demo {
	static int a, b, c;
	int x, y, z;

	static {
		a = 10;
		b = 100;
		c = 1000;
	}

	static void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	{
		x = 9;
		y = 99;
		z = 999;
	}

	void display2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

public class M2 {
	public static void main(String[] args) {
		Demo.display1();
		Demo d1 = new Demo();
		d1.display2();
	}

}

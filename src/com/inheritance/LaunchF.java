package com.inheritance;

class E {
	int a, b;

	E() {
		this.a = 10;
		this.b = 20;
	}

	E(int m, int n) {
		a = m;
		b = n;
	}
}

class F extends E {
	int c, d;

	F() {
		this(111,222);
		c = 30;
		d = 40;
	}

	F(int p, int q) {
		//super(11,22);
		c = p;
		d = q;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class LaunchF {
	public static void main(String[] args) {
		F f1 = new F();
		f1.display();

	}

}

/*
 * even though we are calling parameterized constructor of parent class still it
 * will call default constructor of parent class however if we want to call
 * parameterized constructor of parent call then we should pass the parameters
 * to super method.
 * 
 */

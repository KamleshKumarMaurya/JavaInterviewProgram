package com.inheritance;

class C {
	int a, b;

	C() {
		this.a = 10;
		this.b = 20;
	}

	C(int m, int n) {
		a = m;
		b = n;
	}
}

class D extends C {
	int c, d;

	D() {
		c = 30;
		d = 40;
	}

	D(int p, int q) {
		//super is available by default and it call no-argument of C(super) class constructor
		//super(300,400);//this is called argument constructor of super class
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

public class LaunchD {
	public static void main(String[] args) {
		D d1 = new D(100, 200);
		d1.display();

	}

}

/*
 * even though we are calling parameterized constructor of parent class still it
 * will call default constructor of parent class however if we want to call
 * parameterized constructor of parent call then we should pass the parameters
 * to super method.
 * 
 */

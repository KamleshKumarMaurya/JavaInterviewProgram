package com.demo;

class A1
{
	A1 foo() {
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A1");
	}
}
//A2 is the child class of A1
class A2 extends A1
{
	A2 foo() {
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A2");
	}
}
//A3 is the child class of A2
class A3 extends A2
{
	A3 foo() {
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A3");
	}
}
public class CovariantExample {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.foo().print();
		
		A2 a2 = new A2();
		a2.foo().print();
		
		A3 a3 = new A3();
		a3.foo().print();
	}

}
//The covariant return type specifies that the return type may vary in the same direction as the subclass.

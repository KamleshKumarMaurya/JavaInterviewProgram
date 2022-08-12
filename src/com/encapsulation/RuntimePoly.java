package com.encapsulation;
class Parents
{
	void cry() {
		System.out.println("Parents crying");
	}
}
class Child1 extends Parents
{
	void cry() {
		System.out.println("Child1 crying");
	}
	
	void eat() {
		System.out.println("Child1 eating food");
	}
}
class Child2 extends Parents
{
	void cry() {
		System.out.println("Child2 crying");
	}
	
	void eat() {
		System.out.println("Child2 eating food");
	}
}
class Child3 extends Parents
{
	void cry() {
		System.out.println("Child3 crying");
	}
	
	void eat() {
		System.out.println("Child3 eating food");
	}
}

public class RuntimePoly {
	public static void main(String[] args) {
		Parents p ;
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		p = c1; //assigned child1 to p
		p.cry();
		((Child1)(p)).eat();//downcasting to child1 type means casting parents type to child type refernce 
		
		p = c2;
		p.cry();
		((Child2)p).eat();
		
		p = c3;
		p.cry();
		((Child3)p).eat();
	}

}

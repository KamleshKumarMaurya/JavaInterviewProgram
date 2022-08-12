package com.abstracts;
abstract class A
{
	static void print(){
		System.out.println("A");
	}
	A(){
		System.out.println("ACOns");
	}
}
public class Demo2 {
	Demo2(){
		super();
	}
	public static void main(String[] args) {
		Demo2 re = new Demo2();
	
		A.print();
	}

}

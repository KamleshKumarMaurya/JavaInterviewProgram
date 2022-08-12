package com.inheritance;

class Parents
{
	void print() {
		System.out.println("parents class");
	}
}
class Child1 extends Parents
{
	@Override
	void print() {
		System.out.println("child-1 ");
	}
}

class Child2 extends Parents
{
	@Override
	void print() {
		System.out.println("child-2 ");
	}
}

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		//super class refrence variable can refer to subclass object this is known as upcasting
		Parents pt ;
		
		pt = new Child1();
		pt.print();
		
		pt = new Child2();
		pt.print();
		
	}

}

/*
 	2.Runtime or Dynamic polymorphism => 
 			It is a process in which a function call to the overridden method is resolved at Runtime.
 			This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, 
 			occurs when a derived class has a definition for one of the member functions of the base class. 
 			That base function is said to be overridden.
 
 
 */
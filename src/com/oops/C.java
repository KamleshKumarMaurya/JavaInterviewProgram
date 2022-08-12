package com.oops;
abstract class  A
{
	public void eat(){
		System.out.println("Eating....");
	}
	abstract void run();
}
class B extends A
{
	void run(){
		System.out.println("running....");
	}
}
class C
{
	public static void main(String[] args)
	{
		A b1 = new B();
		b1.eat();
		b1.run();
	}
}
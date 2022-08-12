package com.thread;

class A extends Thread
{
	public void run(){
		for(int i=0; i<100; i++)
		{
			System.out.println("From A : "+i);
		}
	}
}
class B extends Thread
{
	@Override
	public void run() {
		for(int i=110; i<200; i++) {
			System.out.println("From B : "+i);
		}
	}
}

public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1.start();
		b1.start();
		for(int i=201; i<300; i++) {
			System.out.println("From main : "+i);
		}
	}

}

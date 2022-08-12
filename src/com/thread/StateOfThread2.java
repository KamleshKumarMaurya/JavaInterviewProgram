package com.thread;
class H extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
}

public class StateOfThread2 {
	public static void main(String[] args) throws InterruptedException {
		H h1 = new H();
		System.out.println("a: "+h1.getState());
		h1.start();
		System.out.println("b: "+h1.getState());
		Thread.sleep(7);
		System.out.println("c: "+h1.getState());
		Thread.sleep(10000);
		System.out.println("d: "+h1.getState());
	}

}

package com.thread;

class C implements Runnable
{
	@Override
	public void run() {
		for(int i=0; i<100; i++)
		{
			System.out.println("name of C : "+Thread.currentThread().getName());
			System.out.println("from C : "+i);
		}
	}
}

public class M2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C());
		t1.start();
		
		for(int i=100; i<200; i++)
		{
			System.out.println("from main : "+i);
		}
		
	}

}

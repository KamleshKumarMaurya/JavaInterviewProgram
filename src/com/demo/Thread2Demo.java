package com.demo;

class Thread2 extends Thread
{
	@Override
	 public void run() {
		for(int i=11; i<=20; i++)
		{
			System.out.println("From Thread: "+i);
			Util.sleep(2000);
		}
	}
}

public class Thread2Demo implements Runnable{
	
	@Override
	 public void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println("From runnable: "+i);
			Util.sleep(2000);
		}
	}
	
	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		Thread2Demo th1 = new Thread2Demo();
		Thread t1 = new Thread(th1);
		t1.start();
		t2.start();
	}

}

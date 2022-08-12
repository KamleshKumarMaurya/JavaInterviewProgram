package com.thread;
class Thread1 extends Thread
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("th1 - "+i);
		}
	}
}
public class JoinThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		for(int i=10; i<20; i++) {
			System.out.println("main "+i);
		}
	}

}

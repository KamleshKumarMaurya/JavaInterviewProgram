package com.thread;
class I extends Thread
{
	public void run() {
		synchronized(this) {
			try {
				wait();
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
public class States3 {
	public static void main(String[] args) throws InterruptedException {
		I i1 =new I();
		i1.start();
		Thread.sleep(700);
		System.out.println(i1.getState());
	}

}

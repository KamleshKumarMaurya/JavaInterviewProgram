package com.thread;

class D extends Thread {
	public void run() {
		Thread t1 = Thread.currentThread();
		if (t1.isDaemon()) {
			System.out.println("Name of threda : "+t1.getName());
			System.out.println("D is daemon threda");
		} else {
			System.out.println("not daemon thread");
		}
	}
}

public class M4DaemonThreda {
	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();

		d1.setDaemon(true);

		d1.start();
		//d1.setDaemon(true); after start the thread you can't set status as true for setDaemon(true)
		d2.start();
		d3.start();

	}

}

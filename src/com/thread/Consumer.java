package com.thread;

public class Consumer extends Thread {

	Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	public void run() {
		while (true) {
			c.consume_Items();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

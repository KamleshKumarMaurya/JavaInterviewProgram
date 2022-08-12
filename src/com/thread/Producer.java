package com.thread;

public class Producer extends Thread {

	Company c;

	public Producer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) 
		{
			c.producedItem(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}

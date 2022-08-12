package com.thread;

public class Company2 {

	int i;
	boolean f = true;
	synchronized public void producer(int i) throws InterruptedException
	{
		if(!f)
		{
			wait();
		}
		this.i = i;
		System.out.println("Produce : "+this.i);
		f = false;
		notify();
	}
	synchronized public int consumer() throws InterruptedException 
	{
		if(f)
		{
			wait();
		}
		System.out.println("Consume : "+this.i);
		f = true;
		notify();
		return this.i;
	}

}

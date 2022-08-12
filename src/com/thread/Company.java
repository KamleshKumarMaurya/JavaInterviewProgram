package com.thread;

public class Company {
	
	int n;
	boolean f = false;
	//if f = false chance : produce 
	//i f = true chance : consume
	synchronized public void producedItem(int n)
	{
		if(f){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produced : "+this.n);
		f = true;
		notify();
	}
	
	synchronized public int consume_Items()
	{
		if(!f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : "+this.n);
		f = false;
		notify();
		return this.n;
		
	}

}

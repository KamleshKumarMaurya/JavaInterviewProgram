package com.demo;

class UserThread extends Thread
{
	public void run() {
		System.out.println("Thread is under defined thread.....");
		System.out.println("User thread name : "+Thread.currentThread().getName());
	};
}

public class Thread3 {
	public static void main(String[] args) {
		System.out.println("Program started.....");
		
		int x = 10+20;
		System.out.println("Sum is :"+x);
		//Thread name
		String name = Thread.currentThread().getName();
		System.out.println("Name of thread : "+name);
		//Set thread name
		Thread.currentThread().setName("MymainThread");
		System.out.println(Thread.currentThread().getName());
		
		//Sleeep for 2 sec
		Util.sleep(2000);
		
		System.out.println("id of current thread : " +Thread.currentThread().getId());
		//going to start userthread
		UserThread t1 = new UserThread();
		t1.start();
		System.out.println("Program tarminated....");
	}
	

}

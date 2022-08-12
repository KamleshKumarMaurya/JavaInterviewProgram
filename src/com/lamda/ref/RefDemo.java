package com.lamda.ref;

public class RefDemo {
	public static void main(String[] args) {
		System.out.println("Learning Mthod Reference..");
		
		
		//provide the implementation of WorkInter		
		//static method ko refer kiya
		//ClassName::methodName 
		WorkInter workInter = Stuff::doStuff;
		workInter.doTask();
		
		//thread creating
		Runnable runnable = Stuff :: threadTask;
		Thread thread = new Thread(runnable);
		thread.start();
		
		//referring non-static method
		//Objectreference::methodName
		Stuff stf = new Stuff();
		Runnable run1 = stf::printNumber;
		Thread t1 = new Thread(run1);
		t1.start();
	}
}

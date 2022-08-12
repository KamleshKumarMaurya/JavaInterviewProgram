package com.thread;

public class M3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Thread t1 = Thread.currentThread();
				t1.setName("thread-0");
				for(int i=0;i<100; i++)
				{
					
					System.out.println("name : "+t1.getName()+ " id: "+t1.getId()+" : "+i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		for(int i=101; i<200; i++) {
			System.out.println(Thread.currentThread().getId()+" : "+i);
		}
	}

}

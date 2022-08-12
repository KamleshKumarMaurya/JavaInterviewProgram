package com.lamda;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable rn = () ->
		{
			for(int i=0; i<10; i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th1=new Thread(rn);
		th1.setName("Kamlesh");
		System.out.println(th1.getName());
		th1.start();
		
		Runnable rn2 = () ->
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println("2*"+i+" = "+i*2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th2=new Thread(rn2);
		th2.start();
		
	}

}

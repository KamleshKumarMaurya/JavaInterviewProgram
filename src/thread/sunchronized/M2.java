package thread.sunchronized;

import com.demo.Util;

class Shared1
{
	synchronized void test1() {
		Thread t1 = Thread.currentThread();
		for(int i=1; i<=100;i ++)
		{
			System.out.println("From test1 "+i+" by "+t1.getName());
			Util.sleep(2000);
		}
	}
	synchronized void test2() {
		Thread t1 = Thread.currentThread();
		for(int i=1; i<=100;i ++)
		{
			System.out.println("From test2 "+i+" by "+t1.getName());
			Util.sleep(2000);
		}
	}
}
class Thread3 extends Thread
{
	Shared1 s1;
	Thread3(Shared1 s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test1();
	}
}

class Thread4 extends Thread
{
	Shared1 s1;
	Thread4(Shared1 s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test1();
	}
}
public class M2 {
	public static void main(String[] args) {
		Shared1 s1 = new Shared1();
		Shared1 s2 = new Shared1();
		
		Thread3 t3 = new Thread3(s1);
		Thread4 t4 = new Thread4(s1);
		
		t3.start();
		t4.start();
		s1.test1();
	}

}













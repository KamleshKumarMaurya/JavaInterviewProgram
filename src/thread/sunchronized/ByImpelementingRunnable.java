package thread.sunchronized;

import com.demo.Util;

class C implements Runnable
{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=0; i<=100; i++)
		{
			System.out.println("this is from C-class : "+i+" by "+t.getName());
			Util.sleep(1000);
		}
	}
}
class D implements Runnable
{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=101; i<=200; i++)
		{
			System.out.println("this is from D-class : "+i+" by "+t.getName());
			Util.sleep(1000);
		}
	}
}
public class ByImpelementingRunnable {
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++)
		{
			Thread t = Thread.currentThread();
			System.out.println("this is from main-class : "+i+" by "+t.getName());
		    Util.sleep(1000);
		}
		
		ByImpelementingRunnable imp = new ByImpelementingRunnable();
		C c1 = new C();
		D d1 = new D();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(d1);
		
		t1.start();
		t2.start();
		
	}
}

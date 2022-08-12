package thread.sunchronized;

import com.demo.Util;

class A extends Thread
{
	public void run() {
		for(int i=0; i<100;i++)
		{
			System.out.println("this is from A-class : "+i);
			Util.sleep(1000);
		}
	}
}

class B extends Thread
{
	@Override
	public void run() {
		for(int i=110; i<=200; i++)
		{
			System.out.println("this is from B-class : "+i);
			Util.sleep(2000);
		}
	}
}

public class ByExtendingClass extends Thread{
	@Override
	public void run() {
		for(int i=400; i<500;i++)
		{
			System.out.println("this is from main-class : "+i);
			Util.sleep(1000);
		}
	}
	public static void main(String[] args) {
		ByExtendingClass main = new ByExtendingClass();
		A a1 = new A();
		B b1 = new B();
		a1.start();
		b1.start();
		main.start();
	}

}

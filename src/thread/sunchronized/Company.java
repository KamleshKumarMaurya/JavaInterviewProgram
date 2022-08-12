package thread.sunchronized;

public class Company {

	int n;
	boolean f = false;
	synchronized public void produce(int n) {
		if(f)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produce : "+this.n);
		f = true;
		notify();
	}
	
	synchronized public int consume() {
		if(! f) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume : "+this.n);
		f = false;
		notify();
		return n;
	}

}

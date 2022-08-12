package thread.sunchronized;

public class Consumer extends Thread {

	Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	public void run(){
		int i = 1;
		while (true) {
			c.consume();
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			i++;
		}
	}

}

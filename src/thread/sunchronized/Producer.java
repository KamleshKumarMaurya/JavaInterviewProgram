package thread.sunchronized;

public class Producer extends Thread {

	Company c;

	Producer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			c.produce(i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			i++;
		}
	}

}

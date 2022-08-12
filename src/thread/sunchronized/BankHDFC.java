package thread.sunchronized;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less balance, waiting for deposite...");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("withdraw completed....");
	}

	synchronized void deposite(int amount) {
		System.out.println("going to deposite..");
		this.amount = amount;
		System.out.println("deposite completed...");
		notify();
	}
}

public class BankHDFC {
	public static void main(String[] args) {
		Customer cum = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				cum.withdraw(15000);
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				cum.deposite(10000);
			}
		};
		t2.start();
	}
}

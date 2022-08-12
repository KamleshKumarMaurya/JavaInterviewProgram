package thread.sunchronized;

public class MainCompany {
	public static void main(String[] args) {
		
		Company com = new Company();
		Consumer c1 = new Consumer(com);
		Producer p1 = new Producer(com);
		
		c1.start();
		p1.start();
	}

}

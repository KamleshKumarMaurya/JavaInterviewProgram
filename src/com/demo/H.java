package com.demo;
class G
{
	 byte test1() {
		System.out.println("G. test1");
		return 10;
	}
}
class H extends G
{
	
	int test1(int i) {
		System.out.println("H. test1");
		return 100;
	}

	public static void main(String[] args) {
		H h1 = new H();
		h1.test1();
		System.out.println("done");
	}

}
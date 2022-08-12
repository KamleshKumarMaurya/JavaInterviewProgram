package com.demo;
class E
{
	 void test1() {
		System.out.println("E. test1");
	}
}
class F extends E
{
	
	void test1() {
		System.out.println("F. test1");
	}

	public static void main(String[] args) {
		F f1 = new F();
		f1.test1();
		System.out.println("done");
	}

}
//for override - two method of the different class whit these rules-
//1.same signature
//2.same name
//3.same return type
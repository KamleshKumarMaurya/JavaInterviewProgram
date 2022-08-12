package com.lamda;

public class Main {
	public static void main(String[] args) {
		
		//using anonymous inner class
		
		MyInter mt = new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello from inner class ");
			}
		};
		mt.sayHello();
		
		
		//using lambda expression
		
		MyInter mt2 = () -> System.out.println("Hello from lambda expression");
		mt2.sayHello();
	}

}

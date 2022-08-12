package com.interview;

public class M3 {
	public static void main(String[] args) {
		int i = 1;
		switch (i) {
			case 1: {
				System.out.println("1");
				//break;
			}
			i =10; //we can't put any value between switch case if break is there
			case 2: {
				System.out.println("2");
				break;
			}
			case 3: {
				System.out.println("3");
			}
			case 10: {
				System.out.println("4");
			}
		}
	}
}

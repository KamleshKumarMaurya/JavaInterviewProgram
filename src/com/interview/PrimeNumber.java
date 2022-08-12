package com.interview;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ente number");
//		int num = sc.nextInt();
		for(int i=2; i<100; i++) {
			if(primeCheck(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean primeCheck(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2; i<=num/2 ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

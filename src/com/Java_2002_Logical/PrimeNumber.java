package com.Java_2002_Logical;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(primeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean primeNumber(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
		
	}

}

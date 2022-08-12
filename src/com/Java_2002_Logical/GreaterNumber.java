package com.Java_2002_Logical;

public class GreaterNumber {
	public static void main(String[] args) {
		int a =10,b=70,c=18,d=16;
		if(a > b && a > c && a > d) {
			System.out.println(a);
		}else if(b > c && b > d){
			System.out.println(b);
		}else if(c > d ) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
	}

}

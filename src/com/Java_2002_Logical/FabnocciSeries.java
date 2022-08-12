package com.Java_2002_Logical;

public class FabnocciSeries {
	static int num1=0,num2=1,num3,count=2;
	public static void main(String[] args) {
		System.out.print(num1 +","+num2);
		fabnocci(count);
	}
	static void fabnocci(int count) {
		num3 = num1+num2;
		if(num3 > 100) {
			return;
		}
		System.out.print(","+num3);
		num1 = num2;
		num2 = num3;
		fabnocci(count++);
	}

}

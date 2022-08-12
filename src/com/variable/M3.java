package com.variable;
//write program to first half and second half of given number
public class M3 {
	public static void main(String[] args) {
		int num=234567;
		int num1 = num;
		int count=0;
		while(num !=0)
		{
			count++;
			num = num/10;
		}
		int factor = 1;
		for(int i=1; i<=count/2; i++)
		{
			factor = factor * 10;
		}
		int num2 = num1 / factor;
		int num3 = num1 % factor;
		System.out.println(num2);
		System.out.println(num3);
	}

}

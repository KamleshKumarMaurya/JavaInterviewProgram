package com.variable;
//write program to reverse first half of given number
public class M4 {
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
		int revefirst = num2;
		int rev =0 ;
		while(revefirst != 0)
		{
			rev = (rev * 10 )+(revefirst%10);
			revefirst = revefirst / 10;
		}
		
		System.out.print(rev);
		System.out.println(num3);
	}
}
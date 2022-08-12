package com.lamda;

interface Adding
{
	int add(int a, int b);
}
public class M4 {
	public static void main(String[] args) {
		Adding ad = (a,b) -> a+b;
		System.out.println(ad.add(10,20));
	}

}

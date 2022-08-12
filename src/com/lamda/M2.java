package com.lamda;
interface B
{
	void print(String s1);
}
public class M2 {
	public static void main(String[] args) {
		B b1 = (o1) -> System.out.println(o1);
		b1.print("hello");
	}

}

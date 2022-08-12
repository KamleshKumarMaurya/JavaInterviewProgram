package com.lamda;

@FunctionalInterface
interface Dog
{
	String color(String col);
}

public class M1 {
	public static void main(String[] args) {
	
		Dog d1 = (o1) -> o1;//Lambda expression
		System.out.println(d1.color("red"));
	}

}

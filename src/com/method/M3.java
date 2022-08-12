package com.method;
class A
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class C extends A
{
	@Override
	public int add(int a, int b)
	{
		return a*b;
	}
}
public class M3 {
	public static void main(String[] args) {
		A a1 = new C();
		int sum = a1.add(10, 40);
		System.out.println(sum);
		A a2 = new A();
		System.out.println(a2.add(10, 20));
	}

}

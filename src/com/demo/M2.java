package com.demo;
class D
{
	int id; 
	String name;
	int age;
	D(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	D(int id , String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String print()
	{
		return "Id : "+id+" Name : "+name;
	}
	
	public String print(int id)
	{
		return "Id : "+this.id+" Name : "+name+" Age : "+age;
	}
}
public class M2 {
	public static void main(String[] args) {
		
		D d1 = new D(1,"Rahul");
		D d2 = new D(2,"Rakesh",25);
		
		System.out.println(d1.print());
		System.out.println(d2.print());
		
		System.out.println(d1.print(3));
		System.out.println(d2.print(4));
	}

}

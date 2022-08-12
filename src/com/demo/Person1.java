package com.demo;

public class Person1 {
	int id;
	String name;
	int age;
	
	Person1(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public void getDetail() {
		System.out.println("[Id- "+id+" ,Name- "+name+" ,Age- "+age+"]");
		
	}

}

package com.inheritance;

class Players
{
	String name;
	int age;
	double height,weight;
	public Players(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
class Cricketer extends Players
{
	int runs, wicket;
	double average;
	public Cricketer(String name, int age, double height, double weight,int runs,int wicket,double average) {
		super(name,age,height,weight);
		this.runs  = runs;
		this.wicket = wicket;
		this.average = average;
	}
	void display() {
		System.out.println(" Name : "+name+"\n age : "+age+"\n height : "+height+"\n weight : "+weight+"\n runs: "+runs+"\n "
						+ "wicket : "+wicket+"\n average : "+average);
		
	}
}

public class Launch {
	public static void main(String[] args) {
		Cricketer ck = new Cricketer("sachin", 45, 5.6, 65, 10000, 1002, 87);
		ck.display();
	}

}

package com.inheritance;
class Animal
{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
	void breath() {
		System.out.println("Animal is breathing");
	}
}
class Tiger extends Animal
{
	void eat() {
		System.out.println("Tiger meat eating");
	}
}
class Monkey extends Animal
{
	void eat() {
		System.out.println("Monkey banana eating");
	}
}
class Deer extends Animal
{
	void eat() {
		System.out.println("Deer grass eating");
	}
}
public class AnimalLaunch {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.sleep();
		t.breath();
		System.out.println("--------------------");
		Monkey m = new Monkey();
		m.eat();
		m.sleep();
		m.breath();
		System.out.println("--------------------");
		Deer d = new Deer();
		d.eat();
		d.sleep();
		d.breath();
		System.out.println("--------------------");
	}

}

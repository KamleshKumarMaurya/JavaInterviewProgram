package com.inheritance;

class Animal2
{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Tiger2 extends Animal2
{
	void eat() {
		System.out.println("Tiger meat eating");
	}
}
class Monkey2 extends Animal2
{
	void eat() {
		System.out.println("Monkey banana eating");
	}
}
class Deer2 extends Animal2
{
	void eat() {
		System.out.println("Deer grass eating");
	}
}
class MainAnimal
{
	void animal(Animal2 ref) {
		ref.eat();
	}
}
public class Animal2Launch {
	public static void main(String[] args) {
		Animal2 an = new Tiger2();
		an.eat();
		Animal2 m = new Monkey2();
		m.eat();
		Animal2 d = new Deer2();
		d.eat();
	}

}

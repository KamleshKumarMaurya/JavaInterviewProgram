package com.encapsulation;

class Dog {
	private String name;
	private int cost;
	private String color;

	public Dog(String name, int cost, String color) {
		super();
		this.name = name;
		this.cost = cost;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public String getColor() {
		return color;
	}
}

public class LuanchDog {
	public static void main(String[] args) {
		Dog dog = new Dog("Labro", 8000, "Brown");
		//Dog dog2 = new Dog(); cte b/s if there is no constructor then compiler create default constructor 
		System.out.println(dog.getName());
		System.out.println(dog.getCost());
		System.out.println(dog.getColor());
	}
}

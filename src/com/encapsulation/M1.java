package com.encapsulation;

class Dog1 {
	private String name;
	private int cost;
	private String color;

	public Dog1(String name, int cost, String color) {
		super();
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	Dog1(){
		
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

public class M1 {
	public static void main(String[] args) {
		Dog1 dog2 = new Dog1(); //cte b/s if there is no constructor then compiler create default constructor 
		System.out.println(dog2.getName());
		System.out.println(dog2.getCost());
		System.out.println(dog2.getColor());
	}
}

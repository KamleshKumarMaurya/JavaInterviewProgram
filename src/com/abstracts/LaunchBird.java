package com.abstracts;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	void eat() {
		System.out.println("eagle eat snakes and fishes");
	}
	abstract void fly();
}
class SerpentEagle extends Eagle
{
	void fly()
	{
		System.out.println("serpentEagle flies over mountain");
	}
}
class GoldenEagle extends Eagle
{
	void fly()
	{
		System.out.println("GoldenEagle flies over ocean");
	}
}
class Sparrow extends Bird
{
	void fly() {
		System.out.println("sparrow flies at low height");
	}
	void eat() {
		System.out.println("sparrow eats grains");
	}
}
class Sky
{
	void permit(Bird ref) {
		ref.eat();
		ref.fly();
	}
}
public class LaunchBird {
	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		Sparrow sp = new Sparrow();
		Sky sky = new Sky();
		sky.permit(sp);
		sky.permit(se);
		sky.permit(ge);
	}
	

}

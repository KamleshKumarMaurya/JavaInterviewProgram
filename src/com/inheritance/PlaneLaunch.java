package com.inheritance;
class Plane
{
	void takeOff() {
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class CargoPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("cargo plane is flying at low height");
	}
	
	void carryCargo()
	{
		System.out.println("flying with cargo");
	}
}

class PassengerPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("passenger plane is flying at medium height");
	}
	
	void passengers()
	{
		System.out.println("flying with passengers");
	}
}

class FighterPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("fighter plane is flying at high height");
	}
	
	void fighter()
	{
		System.out.println("flying with arms");
	}
}
public class PlaneLaunch {
	public static void main(String[] args) {
		Plane ref;
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		ref = cp;
		ref.takeOff();
		ref.fly();
		((CargoPlane)ref).carryCargo();
		ref.land();
		System.out.println("====================");
		ref = pp;
		ref.takeOff();
		ref.fly();
		((PassengerPlane)ref).passengers();
		ref.land();
		System.out.println("====================");
		ref = fp;
		ref.takeOff();
		ref.fly();
		((FighterPlane)ref).fighter();
		ref.land();
	}

}

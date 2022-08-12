package com.inheritance;

class Plane2
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
class CargoPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("cargoplane is taking off");
	}
	void fly()
	{
		System.out.println("cargoplane is flying");
	}
	void land() {
		System.out.println("cargoplane is landing");
	}
}

class PassengerPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("Passangerplane is taking off");
	}
	void fly()
	{
		System.out.println("Passangerplane is flying");
	}
	void land() {
		System.out.println("Passangerplane is landing");
	}
}

class FighterPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("Fighterplane is taking off");
	}
	void fly()
	{
		System.out.println("Fighterplane is flying");
	}
	void land() {
		System.out.println("Fighterplane is landing");
	}
}
class Airpot {
	void permit(Plane2 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Plane2Launcher {
	public static void main(String[] args) {
		CargoPlane2 cp = new CargoPlane2();
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 fp = new FighterPlane2();
		Airpot a = new Airpot();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}
	
	

}

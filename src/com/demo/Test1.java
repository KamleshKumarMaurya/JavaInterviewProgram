package com.demo;

//where three class override the parent class method
class Bank //parent class
{
	int rateOfInterest() {
		return 0;
	}
}
//child class inherit to Bank class
class SBI extends Bank
{
	@Override
	int rateOfInterest() {
		return 8;
	}
}
//child class inherit to SBI class
class AXIS extends Bank
{
	@Override
	int rateOfInterest() {
		return 7;
	}
}
//child class inherit to AXIS class
class HDFC extends Bank
{
	@Override
	int rateOfInterest() {
		return 9;
	}
}
public class Test1 {
	public static void main(String[] args) {
		SBI s = new SBI();
		AXIS a = new AXIS();
		HDFC h = new HDFC();
		
		System.out.println("SBI Rate of Interest: "+s.rateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.rateOfInterest());  
		System.out.println("HDFC Rate of Interest: "+h.rateOfInterest());  
	}
}
//two method of different class having same name,same return type,same signature if k/w as method override.
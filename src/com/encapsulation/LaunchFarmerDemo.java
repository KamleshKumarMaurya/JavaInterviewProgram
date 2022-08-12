package com.encapsulation;

import java.util.Scanner;

class FarmerDemo
{
	static float roi = 2.0f;//rate of interest same for all so that takes as static variable 
	float p,t,si;
	
	void acceptInput() {
		System.out.println("ENter principle amount");
		Scanner sc = new Scanner(System.in);
		p = sc.nextFloat();
		System.out.println("Enter time duration");
		t = sc.nextFloat();
	}
	
	void compute() {
		si = (p*t*roi)/100;
	}
	
	void display() {
		System.out.println(si);
	}
}
public class LaunchFarmerDemo {
	public static void main(String[] args) {
		FarmerDemo f1 = new FarmerDemo();
		FarmerDemo f2 = new FarmerDemo();
		FarmerDemo f3 = new FarmerDemo();
		
		f1.acceptInput();
		f2.acceptInput();
		f3.acceptInput();
		
		f1.compute();
		f2.compute();
		f3.compute();
		
		f1.display();
		f2.display();
		f3.display();
	}

}

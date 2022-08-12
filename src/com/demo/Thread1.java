package com.demo;

import java.util.Scanner;

class Demo1 extends Thread
{
	@Override
	public void run() {
		System.out.println("Banking activity started");
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter userId");
			String id = sc.next();
			System.out.println("Enter password");
			String pass = sc.next();
			Thread.sleep(3000);
			System.out.println("Login Successfully");
		}
		catch(InterruptedException ex)
		{
			System.out.println("Handled by Demo1");
		}
		System.out.println("Banking activity Completed");
	}
}
class Demo2 extends Thread
{
	@Override
	public void run() {
		try
		{
			System.out.println("Printing stared");
			for(int i=0; i<5; i++)
			{
				System.out.println("BJS");
				Thread.sleep(3000);
			}
			System.out.println("Printing completed");
		}
		catch(InterruptedException ex)
		{
			System.out.println("Handled by Demo2");
		}
	}
}
class Demo3 extends Thread
{
	@Override
	public void run() {
		try
		{
			System.out.println("Addition started");
			int a = 10;
			int b = 20;
			int sum = a + b;
			Thread.sleep(3000);
			System.out.println("Sum = "+sum);
			System.out.println("Addition completed");
		}
		catch(InterruptedException ex)
		{
			System.out.println("Handled by Demo3");
		}
	}
}
public class Thread1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		d2.start();
		d3.start();
	}
}

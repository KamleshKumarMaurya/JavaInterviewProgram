package com.demo;

import java.util.Scanner;
/*
 * Question = find the length of road where student bunk from the class through the boundary of school to skip the head of every student
 * 			  the height of wall may or may not be greater or small then if student is small then count 1m road of each step
 * 			  other wise count 2m each step of road then find total length of road to covered by student. 
 */
public class Test4 {
	
	public static int calculateRoad(int[] arr, int k)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] <= k)
			{
				count++;
			}else
			{
				count += 2;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter height of students ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("Enter height of wall");
		int height = sc.nextInt();
		int roadLength = calculateRoad(arr, height);
		System.out.println("Length of road is : "+roadLength);
	}
	
}
/*
 * O/u
 * 		Enter number of student
		5
		Enter height of students 
		2
		3
		5
		6
		7
		Enter height of wall
		6
		Length of road is : 6

 * 
 */

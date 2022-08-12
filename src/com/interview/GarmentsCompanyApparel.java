package com.interview;

import java.util.Arrays;
import java.util.Scanner;
/*
   print the number which have square root .
   
   like == 9, 81, 3, 6 ,33 ,64
   		output = 9, 81, 64
   		
   		use this formula
   		
   		int X = 9;
		double R = Math.sqrt(X);
		System.out.println("The square root of " + X + " is " + R);
		output => The square root of 9 is 3.0
 
 */
public class GarmentsCompanyApparel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int count=0;
		System.out.print("Area that are square are : ");
		for(int i=0 ;i<array.length; i++) {
			if((array[i]%Math.sqrt(array[i])) == 0.0) {
				System.out.print(array[i]+" ");
				count++;
			}
		}
		System.out.println("\nTotal plats are : "+count);
	}

}

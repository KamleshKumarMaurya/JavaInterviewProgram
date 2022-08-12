package com.demo;

import java.util.Arrays;
import java.util.Scanner;

//sort an array
public class Test15 {

	static void sort(int[] array)
	{
		for(int i=0; i<array.length-1; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	static void reverse(int[] array) {
		for(int i=0; i<array.length/2;i++) {
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Before sorted=====");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		reverse(array);
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println("\nAfter sorted=====");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}

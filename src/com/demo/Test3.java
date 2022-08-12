package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		int std = sc.nextInt();
		System.out.println("Enter time of each student to finish race");
		int[] ar = new int[std];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Enter the kth student");
		int k = sc.nextInt();
		int count=0;
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i] <= ar[k-1])
			{
				count++;
			}
		}
		System.out.println("time of person finising second : "+count);
	}

}

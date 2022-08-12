package com.forLoop;

import java.util.Scanner;

public class M3 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks ");
		for(int i=0 ;i<=4; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("the enter values are");
		for(int i=0 ;i<=4; i++)
		{
			System.out.println(array[i]);
		}
	}

}

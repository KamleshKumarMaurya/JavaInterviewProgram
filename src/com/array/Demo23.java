package com.array;

import java.util.Scanner;

public class Demo23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[1];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++) {
				
					System.out.println("enter the marks of class "+i+" student "+j);
	                a[i][j] = sc.nextInt();  
	          }
	        }     
		System.out.println("Printing  marks.........");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}


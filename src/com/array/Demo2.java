package com.array;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				System.out.println("enter the marks of class "+i+" student "+j);
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				//System.out.println("the entered marks of class "+i+" student "+j);
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
	}

}

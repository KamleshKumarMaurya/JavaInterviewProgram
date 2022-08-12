package com.array;

import java.util.Scanner;

public class Demo22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] array = new int[2][3][3];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					System.out.println("Enter the marks of school "+i+" class "+j+" student "+k);
					array[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					System.out.print(array[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}

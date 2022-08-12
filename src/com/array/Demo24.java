package com.array;

import java.util.Scanner;

public class Demo24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] array = new int[2][][];
		array[0]=new int[3][];
		array[1]=new int[2][];
		array[0][0]=new int[3];
		array[0][1]=new int[1];
		array[0][2]=new int[2];
		array[1][0]=new int[3];
		array[1][1]=new int[2]; 
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

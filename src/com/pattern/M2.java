package com.pattern;

import java.util.Scanner;

/* pattern this print
	* * * * * 
	* * * *
	* * * 
	* *
	* 
*/

public class M2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row");
		int row = sc.nextInt();
		for(int i=row; i>=1; i--)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

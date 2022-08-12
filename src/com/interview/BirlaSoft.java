package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class BirlaSoft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			 num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		int sum[]  = new int[num.length];
		int count=0;
		int j=0;
		for(int i=0; i<sum.length; i++) {
			count += num[i]; 
			sum[j++] = count;
		}
		
		System.out.println(Arrays.toString(sum));
	}

}

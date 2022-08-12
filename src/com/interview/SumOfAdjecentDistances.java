package com.interview;

import java.util.Arrays;
import java.util.Scanner;

/*
 ex==
 
  array = {2,3,6,8,9,6};
  
  answer == 2-3=1
  			3-6=3
  			6-8=2
  			8-9=1
  			6-9=3
  			output == 1+3+2+1+3=>10
 
 
 */
public class SumOfAdjecentDistances {
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
		int sum = 0,j=1;
		for(int i=0; i<size-1; i++) {
			sum += Math.abs(array[i] - array[j]);
//			if((array[i] - array[j]) < 0) {
//				//sum += (-1*(array[i] - array[j]));
//				sum += Math.abs(array[i] - array[j]);//convert negative to positive
//			}else {
//				sum += array[i] - array[j];
//			}
			j++;
		}
		System.out.println("Sum of adjecent number are : "+sum);
		
	}

}

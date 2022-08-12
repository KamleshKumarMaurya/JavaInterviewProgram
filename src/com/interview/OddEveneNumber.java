package com.interview;

import java.util.Arrays;
import java.util.Scanner;

/*
 	ex==
 	    array = {10,98,3,33,12,22,21,11};
 	    output => {10,98,12,22,3,33,21,11};first even number then odd number
 */

public class OddEveneNumber {
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
		int[] newAraay = new int[size];
		int j=0;
		for(int i=0;i<size; i++) {
			if(array[i] % 2 == 0) {
				newAraay[j++] = array[i];
			}
		}
		for(int i=0; i<size; i++) {
			if(array[i] % 2 != 0) {
				newAraay[j++] = array[i];
			}
		}
		
		System.out.println(Arrays.toString(newAraay));
		
	}

}

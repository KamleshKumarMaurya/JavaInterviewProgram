package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class M2 {
	public static void main(String[] args) {
		
		//calculate sum of arrays
		/*float[] array = {10.5f,30.6f,50.7f,90.0f,60.2f};
		float sum=0;
		for(float elements : array)
		{
			sum = sum + elements;
			//sum += elements;
		}
		System.out.println("sum of array values is : "+sum);
		*/
		//find number available in the array or not
		/*int[] array1 = {2,3,56,74,2,566,2};
		int num = 5;
		boolean present = false;
		for(int i=0; i<array1.length; i++)
		{
			if(num == array1[i])
			{
				present = true;
			}
		}
		if(present)
		{
			System.out.println("The value is present in the array");
		}else
		{
			System.out.println("The value is not present in the array");
		}
		*/
		//calculate the average marks of student
		/*int[] marks = {75,65,56,74,82,66,92};
		int sumOfMarks = 0;
		for(int mark : marks)
		{
			sumOfMarks = sumOfMarks + mark;
		}
		//System.out.println("Sum of marks "+sumOfMarks);
		double averMarks =(double) sumOfMarks  / marks.length;
		System.out.println(averMarks);
		*/
		
		//reverse an array
		/*int[] array = {75,65,56,74,82,66};
		System.out.println(Arrays.toString(array));
		System.out.println("After revers array=============");
//		for(int i=0; i<array.length;i++)
//		{
//			for(int j=0;j<array.length-1;j++)
//			{
//				if(array[j] > array[j+1])
//				{
//					array[j] = array[j] + array[j+1];
//					array[j+1] = array[j] - array[j+1];
//					array[j] = array[j] - array[j+1];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(array));
		//using temp variable to reverse
		int temp;
		for(int i=0; i<array.length/2;i++)
		{
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(array));
		*/
		
		
		// find maximum element in array
		/*int[] array = {75,65,56,74,108,82,66,92};
		int maxElement = array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > maxElement)
			{
				maxElement = array[i];
			}
		}
		System.out.println("Maximun eleemnt in array : "+maxElement);
		*/
		
		//check wheather an array is sorted or not
		/*int[] array = {2,4,6,7,8,45,67,70};
		boolean sort = false;
		for(int i=0; i<array.length-1; i++)
		{
			if(array[i] < array[i+1])
			{
				sort = true;
			}
			else
			{
				sort = false;
				break;
			}
		}
		if(sort)
		{
			System.out.println("sort");
		}else
		{
			System.out.println("not sort");
		}
		*/
		
		//2d array
		/* int[][] array1 = {{1,2,3},
						  {4,5,6}};
		
		int[][] array2 = {{2,6,13},
				         {3,7,1}};
		
		int[][] result = {{0,0,0},
						  {0,0,0}};

		for(int i=0; i<array1.length; i++)//row number of times
		{
			for(int j=0; j<array1[i].length; j++)//column number of times
			{
				System.out.printf("Setting value for i=%d and j=%d \n", i,j);
				result[i][j] = array1[i][j] + array2[i][j];
			}
		}
		//printing 2D array
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array1[i].length; j++)
			{
				System.out.print(result[i][j]+" ");
				result[i][j] = array1[i][j] + array2[i][j];
			}
			System.out.println();
		}
	*/
		
	//copy elements of from one to another array
	/*	int[] array = {2,4,6,7,8,45,67,70};
		int[] array2 = new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			array2[i] = array[i];
		}
		System.out.println(Arrays.toString(array2));
	*/
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("enter element of array");
		int[] array = new int[size] ;
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
	*/	
	// Frequency of elements of array
		int[] array = {2,4,1,7,8,2,7,2};
		int count =1;
		int repeat = -1;
		int[] arr = new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			count =1;
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					count++;
					arr[j]=repeat;
				}
			}
			if(arr[i] != repeat)
			{
				arr[i] = count;
			}
		}
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < arr.length; i++){  
            if(arr[i] != repeat)  
                System.out.println("    " + array[i] + "    |    " + arr[i]);  
        }  
        System.out.println("----------------------------------------");  
		
		
	}


}

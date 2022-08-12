package com.demo;
//binary search
public class Test20 {
	public static void main(String[] args) {
		int[] array = {2,3,5,7,23,56,78,80,90};
		int search = 23;
		int first = 0;
		int last = array.length-1;
		int found = binarySort(array, first, last, search);
		if(found == -1)
		{
			System.out.println("not found");
		}else
		{
			System.out.println("found at index "+found);
		}
	}

	static int binarySort(int[] array, int first, int last, int search)
	{
		if(last >= first)
		{
			int mid = first+(last-first)/2;
			if(search == array[mid])
			{
				return mid;
			}
			if(search > array[mid])
			{
				return binarySort(array, mid+1, last, search);
			}
			if(search < array[mid])
			{
				return binarySort(array, first, mid-1, search);
			}
		}
		return -1;
	}
}

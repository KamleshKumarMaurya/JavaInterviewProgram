package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfDuplicateNumberInArray {
	public static void main(String[] args) {
		int[] arr = {3,5,4,3,2,2,1,3,4,7,8,5,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int sum = sumOfArray(arr);
		System.out.println(sum);
	}
	static int sumOfArray(int[] arr) {

		int sum=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> obj : map.entrySet()) {
			if(obj.getValue() > 1) {
				sum += obj.getKey();
			}
		}
		return sum;
	}

}

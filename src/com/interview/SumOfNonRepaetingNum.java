package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SumOfNonRepaetingNum {
	public static void main(String[] args) {
		int[] array = {2,11,3,11,7,3,9,2,5,5,10,12,12};
		int sum = sumOfArray(array);
		System.out.println(sum);
	}
	
	static int sumOfArray(int[] array) {
		Integer sum =0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			if(map.containsKey(array[i])) {
				map.remove(array[i]);
			}else {
				map.put(array[i], 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer> obj : map.entrySet()) {
			sum += obj.getKey();
		}
		return sum;
	}

}

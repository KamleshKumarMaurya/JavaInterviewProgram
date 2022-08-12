package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Countingfrequenciesofarrayelements {
	public static void main(String[] args) {
		int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };
		countFrequency(array);
	}

	static void countFrequency(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			// map.put(array[i], map.get(array[i]) == null ? 1 : map.get(array[i])+1);//this is using ternary operator
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> obj : map.entrySet()) {
			System.out.println(obj.getKey() + " Appears " + obj.getValue() + " times");
		}
	}
}

package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Duplicate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String[] array = s1.split(" ");
		System.out.println(Arrays.toString(array));
		duplicate(array);
	}

	static void duplicate(String[] array) {
		int j = 0;
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < array.length ; i++) {
			set.add(array[i]);
		}
		System.out.println(set);
		String[] array1 = new String[set.size()];
		Iterator<String> it = set.iterator();
		int i = 0;
		while (it.hasNext()) {
			array1[i++] = it.next();
		}
		System.out.println(Arrays.toString(array1));
	}

}

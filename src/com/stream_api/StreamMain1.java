package com.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
	public static void main(String[] args) {

		// Q => create a List and filter all even numbers from list

		// after creating you can't add the values
		List<Integer> list1 = List.of(2, 4, 50, 21,90,125, 22, 67);
		// list1.add(500); //Excepiton
		// you can add values any time
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(22);
		list2.add(78);

		// after creating you can't add the values
		List<Integer> list3 = Arrays.asList(3, 566, 34, 6, 7);
		// list3.add(1000);//Exception

		// list1
		// without stream
		List<Integer> listEven = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println("Even number: " + listEven);

		// using stream api
		//print even numbers
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(newList);

		// or you can use like this also
		List<Integer> newList2 = list1.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(newList2);
		
		//find the number greater than 50
		List<Integer> list50 = list1.stream().filter(i -> i>50).collect(Collectors.toList());
		System.out.println(list50);
		
		
	
	}

}

package com.lamda.ref.cons;

import java.util.List;

public class StreamMain {
	public static void main(String[] args) {
		List<Integer> integers = List.of(14,11234,34,66,77);
		
		System.out.println(integers);
		integers.stream().forEach(System.out::println);
		
		
	}

}

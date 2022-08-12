package com.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//we can't create stream object b/s it is interface

public class StreamObject {
	public static void main(String[] args) {
		
		//Stream API - collection process
		//collection / group of object
		
		//method to get stream object
		
		//1. blank
		Stream<Object> emptyStream = Stream.empty();//empty stream
		
		String names[] = {"Kamlesh","Durgesh","Uttam","Divya"};
		
		//2-array ,object,collection
		Stream<String> stream1 = Stream.of(names);//store array inside stream
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		//3.
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4.
		IntStream stream = Arrays.stream(new int[] {1,3,5,7,8});
		stream.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("================5");
		//5. List,Set
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(22);
		list2.add(78);
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e -> {
			System.out.println(e);
		});
	}

}

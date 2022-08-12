package com.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
	public static void main(String[] args) {
		
		//filter return boolean (true or false)
			//boolean value function
			//like == this is lambda expression == e -> e>10
		
		
		//map(Function) return value
			/*
			 * each element operation
			 * 	
			*/
		
		
		List<String> names = List.of("Aman","Ankit","Abhinav","Kamlseh");
	//	List<String> newName = names.stream().filter(e -> e.charAt(0) =='A').collect(Collectors.toList());
		List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newName);
	//	names.stream().forEach((o)-> System.out.println(o));
		
		List<Integer> numbers = List.of(23,4,2,5,7,4);
		List<Integer> newNumbers = numbers.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//newNumbers.stream().forEach(System.out::println);
		
		//sorted
		System.out.println("sorted asscending order print ");
		//sorting and printing in one 
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("sorted decending oredr print ");
		numbers.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
		
		//min
		Integer minnteger = numbers.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("min : " +minnteger);
		
		//max
		Integer maxInteger = numbers.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("max : "+maxInteger);
	}

}

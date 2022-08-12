package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class M1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,5,2,4,6);
		Integer sum = list.stream().reduce(0, (o1,o2) -> o1+o2);
		System.out.println(sum);
		Integer multi = list.stream().reduce(1, (a1,a2) -> a1*a2);
		System.out.println(multi);
		int max = list.stream().reduce(0, (a,b)-> a>b?a:b);
		System.out.println(max);
		int min = list.stream().reduce(Integer::min).get();
		System.out.println(min);
	}

}

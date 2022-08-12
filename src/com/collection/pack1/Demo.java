package com.collection.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("java");
		list.add("test");
		list.add("xyz");
		list.add("axyz");
		list.add("abc");
		
		//list.stream().filter(o -> o.startsWith("a")).forEach(System.out::println);;
		
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "lara");
		map.put(5, "abc");
		map.put(4, "xyz");
		map.put(3, "hello");
		//map.forEach((key,value) -> System.out.println(key+","+value));
		
		///map.entrySet().stream().forEach(obj -> System.out.println(obj));
		//map.entrySet().stream().forEach(System.out::println);
		
		//map.entrySet().stream().filter((key) -> key.getKey()%2==0).forEach(obj -> System.out.println(obj));
		//map.entrySet().stream().filter((a1) -> a1.getValue().startsWith("a")).forEach((obj)-> System.out.println(obj));
		
		//sorting using stream 
		map.entrySet().stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).forEach(o -> System.out.println(o));;
		
		//sorted using treeSet
		TreeSet<Entry<Integer,String>> tset = new TreeSet<>((o1,o2) -> o1.getValue().compareTo(o2.getValue()));
		tset.addAll(map.entrySet());
		//System.out.println(tset);
	}

}

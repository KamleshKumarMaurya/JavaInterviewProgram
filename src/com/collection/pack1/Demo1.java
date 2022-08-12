package com.collection.pack1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		// treeMapDemo();
		// treeMapSort();
		// treeMapSortOnValue();

		TreeMap<Integer, String> users = new TreeMap<>();

		users.put(1003, "A");
		users.put(1001, "B");
		users.put(1002, "C");
		users.put(1004, "D");

		int id = 1004;
		if (users.containsKey(id)) {
			String name = users.get(id);
			System.out.println("user with id " + id + " : " + name);
		} else {
			System.out.println("user does not exist with id : " + id);
		}

		String name1 = "B";
		Set<Entry<Integer, String>> e1 = users.entrySet();
		for (Entry<Integer, String> e2 : e1) {
			if (e2.getValue().contains(name1)) {
				System.out.println("user with name " + name1 + " id is : " + e2.getKey());
			}
		}
	}

	private static void treeMapDemo() {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("key1", "value1");
		treeMap.put("key3", "value3");
		treeMap.put("key2", "value2");
		treeMap.put("key0", "value0");

		// using for each lambda expression
		treeMap.forEach((a1, a2) -> {
			System.out.print(a1 + " => ");
			System.out.println(a2);
		});
		System.out.println("=====================");
		// using for each
		for (Entry<String, String> a1 : treeMap.entrySet()) {
			System.out.println(a1.getKey() + " => " + a1.getValue());
		}
	}

	private static void treeMapSort() {
		Map<String, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
		treeMap.put("key1", "value1");
		treeMap.put("key3", "value3");
		treeMap.put("key2", "value2");
		treeMap.put("key0", "value0");

		treeMap.forEach((o1, o2) -> System.out.print(o1 + " => " + o2 + "\n"));

	}

	private static void treeMapSortOnValue() {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("key1", "value5");
		treeMap.put("key3", "value4");
		treeMap.put("key2", "value3");
		treeMap.put("key0", "value0");

		TreeSet<Entry<String, String>> set = new TreeSet<>((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		set.addAll(treeMap.entrySet());

		set.stream().forEach(o -> System.out.println(o));
		// treeMap.forEach((o1,o2) -> System.out.print(o1+" => "+o2+"\n"));

	}

}

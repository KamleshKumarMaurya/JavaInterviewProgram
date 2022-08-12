package com.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SortOnValue {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("abc", 100);
		map.put("test", 600);
		map.put("lara", 300);
		map.put("xyz", 900);
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> s1 : set)
		{
			System.out.println(s1.getKey()+":"+s1.getValue());
		}
		TreeSet tset = new TreeSet(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				return ((String)e1.getKey()).compareTo((String)e2.getKey());
				//return ((Integer)e1.getValue()) - ((Integer)e2.getValue());
			}
		});
		tset.addAll(set);
		System.out.println(tset);
	}

}

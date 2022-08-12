package com.collection.pack1;

import java.util.ArrayList;
import java.util.Collection;

public class NeedOfCollection {
	public static void main(String[] args) {
		Collection<String> fruitlist = new ArrayList<>();
		fruitlist.add("banana");
		fruitlist.add("apple");
		fruitlist.add("grapes");
		fruitlist.add("mango");
		System.out.println(fruitlist);
		fruitlist.remove("apple");
		//System.out.println(fruitlist);
		//System.out.println(fruitlist.contains("grapes"));
		//
		fruitlist.forEach((o1) ->System.out.println(o1));
		
		System.out.println("using refrence opertaor and stream========");
		fruitlist.stream().forEach(System.out::println);
	}

}
/*
 * it is use to store any type of object 
 */
package com.collection.pack1;

import java.util.ArrayList;
import java.util.List;

//remove
//removeAll
//clear
public class RemoveElementArrayList {
	public static void main(String[] args) {
		List<String> fruit = new ArrayList<>();
		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Pineaple");
		fruit.add("Grapes");
		
		//fruit.forEach((o1) -> System.out.println(o1));
		System.out.println(fruit);
		
		fruit.remove(2);
		System.out.println("After removing element at index 2 : "+fruit);
		fruit.remove("Orange");
		System.out.println("After removing element Orange : "+fruit);
		
		List<String> subfruit = new ArrayList<>();
		subfruit.add("Banana");
		subfruit.add("Apple");
		//remove subfruit from fruit list
		fruit.removeAll(subfruit);
		System.out.println(fruit);
		
		
		fruit.clear();
		System.out.println(fruit);
	}

}

package com.collection.pack1;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//checking if an array is empty
		System.out.println("Is the list empty : "+list.isEmpty());
		
		//index start from 0
		list.add("C");//0
		list.add("Java");//1
		list.add("Python");//2
		list.add(".net");//3
		
		//size of array list
		System.out.println("size of list  is : "+list.size());
		
		//Retrieve element of an arrayList
		String bestLanguage = list.get(1);
		System.out.println("best programming language => "+bestLanguage);
		
		//modify element at given index
		System.out.println(list.set(3,"C++"));
		System.out.println(list);
		
	}

}

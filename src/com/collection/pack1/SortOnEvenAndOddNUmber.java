package com.collection.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOnEvenAndOddNUmber {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(9);
		list.add(5);
		list.add("test");
		list.add(2);
		list.add(4);
		list.add(5);
		list.add("abc");
		list.add(1);
		list.add(20);
		list.add(13);
		list.add(50);
		list.add(40);
		System.out.println("initila list...." + list);
		for(int i=0; i<list.size(); i++)
		{
			try {
				Integer s1 = (Integer)list.get(i);
			}catch(ClassCastException ex) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		int left=0, right=list.size()-1;
		Object temp = null;
		while(left < right)
		{
			while(((Integer)list.get(left))%2 == 0) {
				left++;
			}
			while(((Integer)list.get(right)) % 2 == 1) {
				right--;
			}
			temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right,temp);
			left++;
			right--;
		}
		Collections.sort(list.subList(0, left),(o1,o2) -> ((Integer)o1).compareTo((Integer)o2));
		Collections.sort(list.subList(left, list.size()),(o1,o2) -> ((Integer)o2).compareTo((Integer)o1));
		System.out.println(list);
	}
	

}

package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_demo{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(3,"Kamlesh","Java"));
		list.add( new Student(2,"Trivanedra","IAS"));
		list.add( new Student(5,"Nitesh","Navy"));
		list.add( new Student(1,"Bhartendra","NEET"));
		list.add( new Student(4,"Rakesh","Plastic"));
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("After sort based on id =====");
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId() - o2.getId();
			}
		});
		Iterator it1 = list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("After sort based on name =====");
		Collections.sort(list, new CompareBasedOnName());
		ListIterator<Student> lt = list.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
	}
	
}

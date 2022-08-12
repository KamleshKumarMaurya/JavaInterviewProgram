package com.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		return id - o.id;
	}
	
}
class SortBasedONName implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Person,String> map = new HashMap<>();
		map.put(new Person(3,"Rahul"), "Java");
		map.put(new Person(2,"Kamlesh"), "Spring");
		map.put(new Person(4,"nitesh"), "python");
		map.put(new Person(1,"anku"), "jdbc");
		Set<Entry<Person,String>> set = map.entrySet();
		for(Entry<Person,String> s1 : set)
		{
			System.out.println(s1.getKey() +"-->"+s1.getValue());
		}
		TreeMap<Person,String> tset = new TreeMap<>(map);
		System.out.println(tset);
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class M1 {
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(3,"rakseh","97475844"));
		list.add(new Emp(5,"Akash","7475844"));
		list.add(new Emp(6,"Tittu","87475844"));
		list.add(new Emp(2,"Kamlesh","45475844"));
		System.out.println(list);
		Collections.sort(list,new IdComparator());
		System.out.println("Sort based on id====");
		System.out.println(list);
		Collections.sort(list,new NameComparator());
		System.out.println("Sort based on name====");
		System.out.println(list);
		Collections.sort(list,new PhoneComparator());
		System.out.println("Sort based on phone====");
		System.out.println(list);
	}

}

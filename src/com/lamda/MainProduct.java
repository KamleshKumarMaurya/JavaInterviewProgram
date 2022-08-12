package com.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProduct {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Rahul",87000));
		list.add(new Product(4,"T.V",8700));
		list.add(new Product(3,"Kamlesh",187000));
		list.add(new Product(2,"Anku",9800));
		
		for(Product p : list)
			System.out.println(p);
		
		System.out.println("Sort base on id=====");
		
		Collections.sort(list,(o1,o2) -> o1.getId() - o2.getId());
		for(Product p : list)
			System.out.println(p);
		
		System.out.println("Sort based on name======");
		
		Collections.sort(list, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		list.forEach(
				(a) -> System.out.println(a));
	}

}

package com.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{
		public int compare(Emp emp1, Emp emp2)
		{
			return emp1.getName().compareTo(emp2.getName());
		}

}

package com.collection;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Emp>{
	
	public int compare(Emp emp1, Emp emp2)
	{
		return emp1.getPhone().compareTo(emp2.getPhone());
	}

}

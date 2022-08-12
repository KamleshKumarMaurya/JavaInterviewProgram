package com.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{
	public int compare(Emp emp1, Emp emp2)
	{
		return emp1.getEmpId() - emp2.getEmpId();
	}

}

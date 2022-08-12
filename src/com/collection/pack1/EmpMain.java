package com.collection.pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SortOnId implements Comparator<Employee>
{
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.getId() - emp2.getId();
	}
}

public class EmpMain {
	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("emp.txt");
		BufferedReader bin = new BufferedReader(fin);
		ArrayList<Employee> list = new ArrayList<>();
		String line;
		while((line = bin.readLine()) != null)
		{
			String[] s1 = line.split("[, ]+");
			Employee emp1 = new Employee();
			emp1.setId(Integer.parseInt(s1[0]));
			emp1.setFirstname(s1[1]);
			emp1.setLastName(s1[2]);
			emp1.setAge(Integer.parseInt(s1[3]));
			emp1.setEmail(s1[4]);
			emp1.setSalary(Integer.parseInt(s1[5]));
			list.add(emp1);
		}
		list.stream().forEach((o1) -> System.out.println(o1));
		System.out.println("Sorf based on id================");
		Collections.sort(list,new SortOnId());
		list.stream().forEach((o1) -> System.out.println(o1));
	
		System.out.println("Sorf based on firstName================");
		Collections.sort(list,(o1,o2) -> o1.getFirstname().compareTo(o2.getFirstname()));
		list.stream().forEach((o1) -> System.out.println(o1));
		
		System.out.println("Sorf based on salary================");
		Collections.sort(list,new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2)
			{
				return o1.getSalary()- o2.getSalary();
			}
		});
		list.stream().forEach((o1) -> System.out.println(o1));
	}

}

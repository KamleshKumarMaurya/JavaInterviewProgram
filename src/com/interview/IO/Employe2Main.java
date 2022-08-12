package com.interview.IO;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employe2Main {
	public static void main(String[] args) {
		List<Employee2> employee2 = new ArrayList<>();
		employee2.add(new Employee2("emp1","CS",10000));
		employee2.add(new Employee2("emp2","CS",15000));
		employee2.add(new Employee2("emp3","IT",20000));
		employee2.add(new Employee2("emp4","IT",25000));
		
		//print higest salary employee
		
//		Collections.sort(employee2, (o1,o2) -> o1.getSalary() - o2.getSalary());
//		
//		System.out.println(employee2.get(employee2.size()-1).getName());
//		System.out.println(employee2.get(employee2.size()-2).getName());
		
		//java 8
		
		Map<String, List<Employee2>> byDepart = employee2.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
		byDepart.forEach((o1,o2) -> System.out.println(o1+":"+o2));
		
		Map<String,Employee2> bySalary = employee2.stream().collect
				(Collectors.groupingBy(e -> e.getDepartment(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
		System.out.println(bySalary);
		
		//average salary from each department
		
		Map<String,Double> avgsalary = employee2.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.averagingInt(Employee2::getSalary)));
		System.out.print("Average salary from each department : ");
		avgsalary.forEach((o1,o2) -> System.out.print(o1+"=>"+o2+"  "));
		System.out.println();
		//avg salary from all employee
		
		Double avg = employee2.stream().collect(Collectors.averagingDouble(Employee2::getSalary));
		System.out.println("total average salary : "+avg);
		
		//find employe name which have maximum salary
		Optional<Employee2> salary = employee2.stream().collect(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)));
		System.out.println("Employee with max salary : "+(salary.isPresent() ? salary.get() : "Not Applicable"));
	}

}

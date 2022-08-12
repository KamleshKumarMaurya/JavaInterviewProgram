package com.interview.IO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("ramu", 27, "male", "HR"));
		employee.add(new Employee("ankita", 24, "female", "IT"));
		employee.add(new Employee("deepu", 25, "male", "HR"));
		employee.add(new Employee("santi", 21, "female", "IT"));
		employee.add(new Employee("akamshu", 20, "female", "Bio"));
		
		//print all
		employee.forEach(System.out::println);
		
		//print in sorting age
		System.out.println("Sorted based on age : ");
		Collections.sort(employee,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		employee.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
		
		//print all count of department 
		
		employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((o1,o2) -> System.out.println(o1+" - "+o2));
	
	
		//max age
		
		Optional<Employee> maxage= employee.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println("Employee with max age : "+maxage);
		
		//max age for each depatment
		Map<String, Employee> ageDep = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)), Optional::get)));
		System.out.println(ageDep);
		
		//average age
		Double avgAge = employee.stream().collect(Collectors.averagingInt(Employee::getAge));
		System.out.println("Average Age : "+ avgAge);
		// avergae age by department
		
		Map<String, Double> avgAgDept = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.averagingDouble(Employee::getAge)));
		for(Map.Entry<String, Double> obj : avgAgDept.entrySet()) {
			System.out.println("Department : "+obj.getKey()+" -> average Age : "+obj.getValue());
		}
		
		//sort reversed order using name
		System.out.println("Sord on name reversed oreder : ");
		employee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}

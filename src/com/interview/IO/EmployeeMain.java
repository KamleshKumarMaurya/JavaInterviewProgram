package com.interview.IO;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("ramu", 27, "male", "HR"));
		employee.add(new Employee("ankita", 24, "female", "IT"));
		employee.add(new Employee("deepu", 25, "male", "HR"));
		employee.add(new Employee("santi", 21, "female", "IT"));
		employee.add(new Employee("akamshu", 20, "female", "Bio"));
		
		//employee.forEach(System.out::println);
//1. print department not duplicate	
		//using java 7
	/*	HashSet<String> set = new HashSet<String>();
		for(Employee emp :employee) {
			set.add(emp.getDepartment());
		}
		set.forEach(System.out::println);
		
		//print department not duplicate using java 8
		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	*/	

// 2 .print count of employe from each department
		
	/*	HashMap<String,Integer> emap = new HashMap<>();
		for(Employee emp : employee) {
			if(emap.containsKey(emp.getDepartment())) {
				int count = emap.get(emp.getDepartment());
				emap.put(emp.getDepartment(), count+1);
			}else {
				emap.put(emp.getDepartment(), 1);
			}
		}
		System.out.println(emap);
		
		Map<String, Long> map = 
					employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
	*/	

//3. print avergare age of male and female employee
		
	/*	int f = 0;
		int m = 0;
		int mcount = 0;
		int fcount = 0;
	
		for (Employee emp : employee) {
			if (emp.getGender().equals("male")) {
				m += emp.getAge();
				mcount++;
			} else {
				f += emp.getAge();
				fcount++;
			}
		}
		double favg = (f / fcount);
		System.out.println("male : " + (double) (m / mcount));
		System.out.println("female : " + favg);
		
		//using java 8
		Map<String,Double> map = 
				employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			
		map.forEach((k,v) -> System.out.print(k+":"+v+"  "));
*/		
		
	//print duplicate element from array
	
		List<Integer> list = Arrays.asList(10,20,30,30,40,50,50);
			
		//java 7
		
		HashSet<Integer> set = new HashSet<>();
//		for(Integer obj : list) {
//			if(!set.add(obj)) {
//				System.out.println(obj);
//			}
//		}
			
		//java 8
		
		list.stream().filter((num) -> !(set.add(num))).forEach(System.out::println);
			
			
			
		
		
		
		
		
		
		
		
		
	}

}

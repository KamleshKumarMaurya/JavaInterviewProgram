package com.interview.IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee3Main {
	public static void main(String[] args) {
		Employee3[] emp = new Employee3[10];
		emp[0] = new Employee3("Ramesh", 10000);
		emp[1] = new Employee3("rakesh Maury", 15000);
		emp[2] = new Employee3("anku", 30000);
		emp[3] = new Employee3("kamlesh kumar", 40000);
		emp[4] = new Employee3("deepu", 14000);
		emp[5] = new Employee3("nitesh Maury", 25000);
		emp[6] = new Employee3("garav maury", 13000);
		emp[7] = new Employee3("gujesh kumar", 11000);
		emp[8] = new Employee3("ajay kumar", 19000);
		emp[9] = new Employee3("vinay kumar", 21000);
		print(emp);
		
		//1. print amount of salary coast per menth 
		Long amoutSalaryPerMonth = 0l;
		for(int i=0; i<emp.length; i++) {
			amoutSalaryPerMonth += emp[i].getSalary();
		}
		System.out.println(amoutSalaryPerMonth);
		
		//2. find an employee with min salary
		/*
		 // with out comparater
			int max = emp[0].getSalary();
			int id = 0;
			for(int i=0; i<emp.length; i++) {
				if(max < emp[i].getSalary()) {
					max = emp[i].getSalary();
					id = i;
				}
			}
			
			System.out.println(emp[id]);
		*/
		List<Employee3> list = Arrays.asList(emp);
		Collections.sort(list,(o1,o2) -> o1.getSalary() - o2.getSalary());
		//System.out.println("Employee with min salary : "+list.get(0));
		
		//using java 8
		Optional<Employee3> map = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(o1->o1.getSalary())));
		System.out.println("Max salary Employee : "+(map.isPresent() ? map.get(): "Not found"));
		
		
		//3.employee with maxium salary
		
		Optional<Employee3> min = list.stream().collect(Collectors.minBy(Comparator.comparingInt(o1->o1.getSalary())));
		System.out.println("Min salary Employee : "+(min.isPresent() ? min.get(): "Not found"));
		//System.out.println("Employee with max salary : "+list.get(list.size()-1));
		
		//4.average salary
		
		double avgSalary = amoutSalaryPerMonth / emp.length;
		System.out.println("Average Salary : "+avgSalary);
		
		//5. print full name of all employee
		for(int i=0; i<list.size(); i++) {
			System.out.println("FullName : "+list.get(i).getName());
		}
	}
	
	static void print(Employee3[] emp) {
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
	}

}

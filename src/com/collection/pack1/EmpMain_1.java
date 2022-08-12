package com.collection.pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmpMain_1 {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("emp.txt");
		BufferedReader bin = new BufferedReader(fin);
		ArrayList<Employee> list = new ArrayList<>();
		String id, firstName, lastName, age, email, salary, record;
		int fromIndex = 0, toIndex;
		Employee emp;
		while ((record = bin.readLine()) != null) {

			toIndex = record.indexOf(",");
			id = record.substring(fromIndex, toIndex);

			fromIndex = toIndex + 1;
			toIndex = record.indexOf(",", fromIndex);
			firstName = record.substring(fromIndex, toIndex);

			fromIndex = toIndex + 1;
			toIndex = record.indexOf(",", fromIndex);
			lastName = record.substring(fromIndex, toIndex);

			fromIndex = toIndex + 1;
			toIndex = record.indexOf(",", fromIndex);
			age = record.substring(fromIndex, toIndex);

			fromIndex = toIndex + 1;
			toIndex = record.indexOf(",", fromIndex);
			email = record.substring(fromIndex, toIndex);

			fromIndex = toIndex + 1;
			salary = record.substring(fromIndex);

			emp = new Employee();
			emp.setId(Integer.parseInt(id.trim()));
			emp.setFirstname(firstName.trim());
			emp.setLastName(lastName.trim());
			emp.setAge(Integer.parseInt(age.trim()));
			emp.setEmail(email.trim());
			emp.setSalary(Integer.parseInt(salary.trim()));
			list.add(emp);
			fromIndex = 0;
		}
		list.stream().forEach((o1) -> System.out.println(o1));

//		System.out.println("Sort based on id===========");
//		Collections.sort(list, new SortBasedOnId());
//		list.stream().forEach((o1)-> System.out.println(o1));
//		
//		System.out.println("Sord on fisrtName============");
//		Collections.sort(list,(o1,o2) -> o1.getFirstname().compareTo(o2.getFirstname()));
//		list.stream().forEach((o1)-> System.out.println(o1));
//		
//		System.out.println("Sord on email============");
//		Collections.sort(list,(o1,o2) -> o1.getEmail().compareTo(o2.getEmail()));
//		list.stream().forEach((o1)-> System.out.println(o1));

		Scanner sc = new Scanner(System.in);
		String action;
		try {
			do {
				System.out.println("Enter on which method you want to sort ");
				action = sc.next();
				Comparator<Employee> com = null;
				if (action.equals("id")) {
					com = new SortBasedOnId();
				}
				if (action.equals("firstName")) {
					com = new SortBasedOnfirstName();
				}
				if (action.equals("lastName")) {
					com = new SortBasedOnLastName();
				}
				if(action.equals("age")) {
					com = (o1,o2) -> (o1.getAge() - o2.getAge());
				}
				if(action.equals("email")) {
					com = (o1,o2) -> (o1.getEmail().compareTo(o2.getEmail()));
				}
				if(action.equals("salary")) {
					com = (o1,o2) -> (o1.getSalary() - o2.getSalary());
				}
				
				Collections.sort(list, com);
				System.out.println("Sort based on ========= " + action);
				list.stream().forEach((o1) -> System.out.println(o1));
				System.out.println("you want again sort (y/n)?");
			} while ("y".equalsIgnoreCase(sc.next()));
			System.out.println("Thanks....");
		} catch (Exception e) {
			System.out.println("Plse enter correct name for sorting...");
			e.printStackTrace();
		}

	}

}

class SortBasedOnId implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getId() - emp2.getId();
	}

}

class SortBasedOnfirstName implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getFirstname().compareTo(emp2.getFirstname());
	}

}

class SortBasedOnLastName implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getLastName().compareTo(emp2.getLastName());
	}

}

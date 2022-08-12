package com.interview.IO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee4Main {
	
	static ArrayList<Employee4> employeeList = new ArrayList<>();
	public static void main(String[] args) {
		
		employeeList.add(new Employee4(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee4(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee4(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee4(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee4(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee4(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee4(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee4(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee4(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee4(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee4(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee4(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee4(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee4(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee4(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee4(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee4(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		//employeeList.forEach(System.out::println);
		
		// Query 1 : How many male and female employees are there in the organization?
		method1();
		System.out.println("\n");
		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");
		// Query 3 : What is the average age of male and female employees?
		method3();
		System.out.println("\n");
		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		System.out.println("\n");
		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		System.out.println("\n");
		// Query 6 : Count the number of employees in each department?
		method6();
		System.out.println("\n");
		// Query 7 : What is the average salary of each department?
		method7();
		System.out.println("\n");
		// Query 8 : Get the details of youngest male employee in the product
		// development department?
		method8();
		System.out.println("\n");
		// Query 9 : Who has the most working experience in the organization?
		method9();
		System.out.println("\n");
		// Query 10 : How many male and female employees are there in the sales and
		// marketing team?
		method10();
		System.out.println("\n");
		// Query 11 : What is the average salary of male and female employees?
		method11();
		System.out.println("\n");
		// Query 12 : List down the names of all employees in each department?
		method12();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		System.out.println("\n");
		// Query 14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.
		method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
		method15();
	}

	static void method1() {
		System.out.println("Query 1 : How many male and female employees are there in the organization?");
		Map<String, Long> noOfMaleAndFemaleEmployee = 
						employeeList.stream().collect(Collectors.groupingBy(Employee4::getGender,Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee);
	}
	
	static void method2() {
		System.out.println("Query 2 : Print the name of all departments in the organization?");
		employeeList.stream().map(Employee4::getDepatment).distinct().forEach(System.out::println);
	}
	
	static void method3() {
		System.out.println("Query 3 : What is the average age of male and female employees?");
		Map<String,Double> averageAgeOfMaleAndFemaleEmployee =
				employeeList.stream().collect(Collectors.groupingBy(Employee4::getGender,Collectors.averagingInt(Employee4::getAge)));
		System.out.println(averageAgeOfMaleAndFemaleEmployee);
	}
	
	static void method4() {
		System.out.println("Query 4 : Get the details of highest paid employee in the organization?");
		Optional<Employee4> highestPaidEmployeeWrapper  = 
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee4::getSalary)));
		System.out.println(highestPaidEmployeeWrapper.get().getName());
		System.out.println(highestPaidEmployeeWrapper.get().getSalary());
	}
	
	static void method5() {
		System.out.println("Query 5 : Get the names of all employees who have joined after 2015?");
		employeeList.stream().filter(e -> e.getDoj() > 2015).map(Employee4::getName).forEach(System.out::println);
	}
	static void method6() {
		System.out.println("Query 6 : Count the number of employees in each department?");
		Map<String,Long> employeeCountByDepartment  = 
				employeeList.stream().collect(Collectors.groupingBy(Employee4::getDepatment,Collectors.counting()));
		employeeCountByDepartment.forEach((o1,o2) -> System.out.println(o1+" : "+o2));
	}
	
	static void method7() {
		System.out.println("Query 7 : What is the average salary of each department?");
		Map<String,Double> avgSalaryOfDepartments = 
				employeeList.stream().collect(Collectors.groupingBy(Employee4::getDepatment,Collectors.averagingDouble(Employee4::getSalary)));
		avgSalaryOfDepartments.forEach((o1,o2)-> System.out.println(o1+" : "+o2));
	}
	
	static void method8() {
		System.out.println("Query 8 : Get the details of youngest male employee in the Product development department?");
		Optional<Employee4> youngestMaleEmployeeInProductDevelopmentWrapper = 
				employeeList.stream().filter(o1 -> o1.getGender() == "Male" && o1.getDepatment() == "Product Development").min(Comparator.comparingInt(Employee4::getAge));
		System.out.println("Details Of Youngest Male Employee In Product Development");
		System.out.println("----------------------------------------------");
		System.out.println("Id : "+youngestMaleEmployeeInProductDevelopmentWrapper.get().getId());
		System.out.println("Name : "+youngestMaleEmployeeInProductDevelopmentWrapper.get().getName());
	}
	
	static void method9() {
		System.out.println("Query 9 : Who has the most working experience in the organization?");
		Optional<Employee4> seniorMostEmployee= employeeList.stream().sorted(Comparator.comparingInt(Employee4::getDoj)).findFirst();
		System.out.println("Senior Most Employee Details :");
		System.out.println("----------------------------");
		System.out.println("Id : "+seniorMostEmployee.get().getId());
		System.out.println("Name : "+seniorMostEmployee.get().getName());
	}
	
	static void method10() {
		System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team?");
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
				employeeList.stream()
				            .filter(e -> e.getDepatment()=="Sales And Marketing")
				            .collect(Collectors.groupingBy(Employee4::getGender, Collectors.counting()));
				System.out.println(countMaleFemaleEmployeesInSalesMarketing);
	}
	
	static void method11() {
		System.out.println("Query 11 : What is the average salary of male and female employees?");
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee4::getGender, Collectors.averagingDouble(Employee4::getSalary)));
				         
				System.out.println(avgSalaryOfMaleAndFemaleEmployees);
		
	}
	
	static void method12() {
		System.out.println("Query 12 : List down the names of all employees in each department?");
		Map<String, List<Employee4>> employeeListByDepartment=
				employeeList.stream().collect(Collectors.groupingBy(Employee4::getDepatment));
				         
				Set<Entry<String, List<Employee4>>> entrySet = employeeListByDepartment.entrySet();
				         
				for (Entry<String, List<Employee4>> entry : entrySet) 
				{
				    System.out.println("--------------------------------------");
				             
				    System.out.println("Employees In "+entry.getKey() + " : ");
				             
				    System.out.println("--------------------------------------");
				             
				    List<Employee4> list = entry.getValue();
				             
				    for (Employee4 e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
		
	}

	static void method13() {
		System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics employeeSalaryStatistics=
				employeeList.stream().collect(Collectors.summarizingDouble(Employee4::getSalary));
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	
	}
	static void method14() {
		
		System.out.println(
				"Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		Map<Boolean, List<Employee4>> partitionEmployeesByAge=
				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
				         
				Set<Entry<Boolean, List<Employee4>>> entrySet = partitionEmployeesByAge.entrySet();
				         
				for (Entry<Boolean, List<Employee4>> entry : entrySet) 
				{
				    System.out.println("----------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employees older than 25 years :");
				    }
				    else
				    {
				        System.out.println("Employees younger than or equal to 25 years :");
				    }
				             
				    System.out.println("----------------------------");
				             
				    List<Employee4> list = entry.getValue();
				             
				    for (Employee4 e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
	
	}
	
	static void method15() {
		
		System.out.println(
				"Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");
		Optional<Employee4> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee4::getAge));
        
		Employee4 oldestEmployee = oldestEmployeeWrapper.get();
		         
		System.out.println("Name : "+oldestEmployee.getName());
		         
		System.out.println("Age : "+oldestEmployee.getAge());
		         
		System.out.println("Department : "+oldestEmployee.getDepatment());
		
	}
}





















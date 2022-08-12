package com.interview.IO;

public class Employee4 {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String depatment;
	private int doj;
	private double salary;
	public Employee4(int id, String name, int age, String gender, String depatment, int doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.depatment = depatment;
		this.doj = doj;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepatment() {
		return depatment;
	}
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", depatment="
				+ depatment + ", doj=" + doj + ", salary=" + salary + "]";
	}
	
	

}

package com.lamda.ref.cons;

public class ConsMain {
	public static void main(String[] args) {
		System.out.println("Learning Constructor refrence");
		
		//Constructor reference
		//ClassName::new
		Provider provider = Student::new;
		
		Student std = provider.getStudent();
		std.display();
	}

}

package com.inheritance;
class MultiPly
{
	//overloading this method
	static int multiPly(int a, int b) {
		return a*b;
	}
	
	//overloading this method
	static double multiPly(double a, double b) {
		return a*b;
	}
}
public class CompileTimePolymorphism {
	
	public static void main(String[] args) {
		System.out.println(MultiPly.multiPly(10, 20));
		System.out.println(MultiPly.multiPly(2.5, 3.0));
	}

}


/*
 	The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability 
 	of a message to be displayed in more than one form. 
 	Two types of poly =
 	1.CompileTime or static polymorphism => 	
 			This type of polymorphism is achieved by function overloading or operator overloading. 
 			Method Overloading: When there are multiple functions with the same name but different parameters then 
 								these functions are said to be overloaded. Functions can be overloaded by change in 
 								the number of arguments or/and a change in the type of arguments.
 	
 	2.Runtime or Dynamic polymorphism => 
 			This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, 
 			occurs when a derived class has a definition for one of the member functions of the base class. 
 			That base function is said to be overridden.
 
 
*/

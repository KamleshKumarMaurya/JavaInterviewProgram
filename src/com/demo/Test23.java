package com.demo;

/*
 * Write a Java Program to check if any number is a magic number or not. 
 * A number is said to be a magic number if after doing sum of digits in each step 
 * and inturn doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.
Example, consider the number:

Step 1: 163 => 1+6+3 = 10
Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number
 */

public class Test23 {
	public static void main(String[] args) {
		int number = 532;
		int sumOfDigit = 0;
		while(number > 0 || sumOfDigit > 9)
		{
			if(number == 0)
			{
				number = sumOfDigit;
				sumOfDigit = 0;
			}
			sumOfDigit += number % 10;
			number = number/10;
		}
		if(sumOfDigit == 1)
		{
			System.out.println("Magic number");
		}else
		{
			System.out.println("not magic number");
		}
	}

}

package com.lamda;

public class MainAdd {

	public static void main(String[] args) {
		
		SumInter sum = (o1,o2) -> {
			System.out.print("sum of "+o1+ " and "+o2+" is : ");
			return o1+o2;
		};
		System.out.println(sum.sum(10,40));
		System.out.println(sum.sum(30,40));

	}
}

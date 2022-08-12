package com.interview;

import java.util.ArrayList;

public class ArmstrongNumber_2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1634);
		list.add(153);
		list.add(125);
		
		ArrayList<String> newList = new ArrayList<>();
		for(Integer obj : list) {
			if(armstrongFind(obj)) {
				newList.add("It is Armstronh number");
			}else {
				newList.add("It is Not Armstronh number");
			}
		}
		for(String obj : newList) {
			System.out.println(obj);
		}
	}

	public static int digitFind(int num) {
		int count=0;
		while(num > 0) {
			num = num /10;
			count++;
		}
		return count;
	}
	
	static boolean armstrongFind(int num) {
		int sum=0;
		int num1 = num;
		int digit = digitFind(num);
		while(num1 > 0) {
			int first = num1 % 10;
			sum += Math.pow(first, digit);
			num1 = num1 / 10;
		}
		if(num == sum) {
			return true;
		}
		return false;
	}
	
}



package com.string;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		//System.out.println(toUpperCase(name));
		String[] arr = name.split("[,. ]+");
		for(int i=0; i<arr.length; i++)
		{
			String s1 = arr[i];
			if(s1 == null)
			{
				System.out.println("null");
			}
			else
			{
				String s2 = toUpperCase(s1);
				System.out.print(s2+" ");
			}
		}
	}
	static String toUpperCase(String name)
	{
		String newName="";
		newName += Character.toUpperCase(name.charAt(0));
		newName += name.substring(1, name.length());
		return newName;
	}

}

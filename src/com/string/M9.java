package com.string;

public class M9 {
	public static void main(String[] args) {
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		
		if((s1.compareTo(s2) >0))
		{
			System.out.println("s1 is greater "+s1.compareTo(s2));
		}else if((s1.compareTo(s2) <0))
		{
			System.out.println("s2 is greater " +s1.compareTo(s2));
		}
		else
		{
			System.out.println("both are same "+s1.compareTo(s2));
		}
		
	}

}

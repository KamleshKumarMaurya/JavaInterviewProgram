package com.string;

public class M10 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();//it thread safe
		System.out.println(s1.capacity()+" "+s1);//16
		System.out.println(s1.length());//0
		s1.append("sachin");
		System.out.println(s1.capacity()+" "+s1);//16
		System.out.println(s1.length());//6
		s1.append(" is a great batsman.");
		System.out.println(s1.capacity()+" "+s1);
		System.out.println(s1.length());
		s1.append("He is from india");
		System.out.println(s1.capacity()+" "+s1);
		System.out.println(s1.length());
	}

}

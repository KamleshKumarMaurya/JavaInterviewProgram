package com.string;

public class M6 {
	public static void main(String[] args) {
		String s1 = "RAMA";
		String s2 = "SITA";
		String s3 = s1+s2;//string constant pool create address
		String s4 = s1+s2;//scp but address different
		System.out.println(s3);
		if(s3==s4)
		{
			System.out.println("equals");
		}else
		{
			System.out.println("not");
		}
		if(s3.equals(s4))
		{
			System.out.println("equals");
		}else
		{
			System.out.println("not");
		}
	}

}

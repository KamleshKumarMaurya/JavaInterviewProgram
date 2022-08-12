package com.string;

public class M7 {
	public static void main(String[] args) {
		String s1 = "RAMA";
		String s2 = "SITA";
		String s3 = s1+"SITA";//heap memory(non constant pool)
		String s4 = "RAMA"+s2;//heap memory(non constant pool)
		System.out.println(s3);
		System.out.println(s4);
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

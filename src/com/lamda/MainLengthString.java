package com.lamda;

public interface MainLengthString {
	public static void main(String[] args) {
		LengthInter litr = (o1) ->{
			System.out.print("Length of "+o1+" is : ");
			return o1.length();
		};
		System.out.println(litr.length("Hello"));
		System.out.println(litr.length("missippi"));
	}

}

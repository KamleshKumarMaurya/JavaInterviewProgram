package com.interview;

public class M1 {
	public static void main(String[] args) {
		 short x = 10;
         //x =  x * 5;
         System.out.print(x);
		char[] array = new char[5];
		for(int i=0; i<array.length; i++) {
			array[i] = 'i';
			System.out.print(i);
			System.out.print(array[i++]);
			i++;
		}
	}

}

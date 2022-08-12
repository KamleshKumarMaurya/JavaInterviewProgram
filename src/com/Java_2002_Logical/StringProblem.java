package com.Java_2002_Logical;
//assume a string of lower case and print bob in string how many times comes String s = "azcbobobegghaklbob";
public class StringProblem {
	public static void main(String[] args) {
		int count=0;
		String s = "azcbobobegghaklbob";
		for(int i=0; i<s.length()-2; i++) {
			if(s.charAt(i) == 'b') {
				int fromIndex = i;
				int toIndex = i+3;
				String s1 = s.substring(fromIndex, toIndex);	
				if(s1.equals("bob")) {
					count = count+1;
				}
			}
		}
		System.out.println(count);
	}

}

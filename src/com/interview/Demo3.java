package com.interview;
//remove space
public class Demo3 {
	public static void main(String[] args) {
		String s1 = "hello btm  123    lara";
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		String s2 = "";
		while(toIndex != -1) {
			s2 += s1.substring(fromIndex,toIndex);
			toIndex = spaceCount(s1,toIndex);
			fromIndex = toIndex+1;
			toIndex = s1.indexOf(' ',fromIndex);
		}
		s2 += s1.substring(fromIndex);
		System.out.println(s2);
	}
	static int spaceCount(String s1, int toIndex) {
		char c = s1.charAt(toIndex+1);
		while(c== ' ') {
			++toIndex;
			c = s1.charAt(toIndex+1);
		}
		return toIndex;
	}

}

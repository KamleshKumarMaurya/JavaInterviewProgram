package com.interview;

public class MaxOccurance {
	public static void main(String[] args) {
		String str = "easampsle string saele";
		System.out.println("Max occurring character is : " + getMaxOccurChar(str));
	}

	static char getMaxOccurChar(String s1) {
		int[] temp = new int[127];
		for (int i = 0; i < s1.length(); i++) {
			temp[s1.charAt(i)] = temp[s1.charAt(i)] + 1;
		}
		int max = -1;
		char c = ' ';
		for (int i = 0; i < s1.length(); i++) {
			if (max < temp[s1.charAt(i)]) {
				max = temp[s1.charAt(i)];
				c = s1.charAt(i);
			}
		}
		return c;
	}


}

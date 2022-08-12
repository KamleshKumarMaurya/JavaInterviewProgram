package com.demo;

public class DemoAll {
	public static void main(String[] args) {
		String s1 = "missippippp";
		charDuplicate2(s1);
		System.out.println("duplicate char : "+charDuplicate(s1));
		revserString(s1);
		int[] array = {3,5,7,8,2,4,6};
		printArray(array);//print array without last ,
		
	}
	
	static String charDuplicate(String s1) {
		int count;
		String s2= "";
		for(int i=0; i<s1.length(); i++) {
			count=1;
			for(int j=i+1; j<s1.length()-1; j++) {
				if(s1.charAt(i) == s1.charAt(j) && s1.charAt(j) != ' ') {
					count++;
					
				}
			}
			if(count >1 && s1.charAt(i) != ' ') {
				s2 += s1.charAt(i);
			}
		}
		return s2;
	}
	
	static void charDuplicate2(String s1) {
		char[] s2 = s1.toCharArray();
		int count=1;
		for(int i=0; i<s2.length;i++)
		{
			count=1;
			for(int j=i+1; j<s2.length; j++) {
				if(s2[i] == s2[j] && s2[i] != ' ') {
					count++;
					s2[j] = '0';
				}
			}
			if(count > 1 && s2[i] != '0') {
				System.out.println(s2[i]+":"+count);
			}
		}
	}
	static void revserString(String s1) {
		char[] s2 = s1.toCharArray();
		for(int i=0; i<s2.length/2; i++) {
			char temp = s2[i];
			s2[i] = s2[s2.length-1-i];
			s2[s2.length-i-1] = temp;
		}
		System.out.println(s2);
	}
	
	public static void printArray(int[] myArray)
	{

	    System.out.print("[");
	    for(int i = 0; i < myArray.length; i++)
	    {
	        if (i > 0)
	        {
	            System.out.print(", ");
	        }
	        System.out.print(myArray[i]);
	    }
	    System.out.println("]");
	}
	
}


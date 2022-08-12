package com.method;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M4 {
	
	public static String reverse(String s1)
	{
		if(s1.length() == 0)
		{
			return "";
		}
		return s1.charAt(s1.length()-1)+reverse(s1.substring(0, s1.length()-1));
	}
	
	public static void sort(char[] s1)
	{
		for(int i=0; i<s1.length;i ++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				if(s1[i] > s1[j])
				{
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
	}
	
	
	public static void printDuplicateChar(String s1)
	{
		int count;
		char[] c1 = s1.toCharArray();
		for(int i=0;i<c1.length; i++)
		{
			count=1;
			for(int j=i+1; j<c1.length; j++)
			{
				if(c1[i] == c1[j] && c1[i] != ' ')
				{
					count++;
					c1[j] = '0';
				}
			}
			if(count >1 && c1[i] != '0')
			{
				System.out.println(c1[i]);
			}
		}
		
	}
	
	static void printOccuraneOfChar(String s1)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		int count = 1;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i) != ' ')
			{
				if(map.keySet().contains(s1.charAt(i)))
				{
					count = map.get(s1.charAt(i));
					map.put(s1.charAt(i), ++count);
				}else
				{
					map.put(s1.charAt(i), 1);
				}
			}
		}
		Set<Entry<Character,Integer>> set = map.entrySet();
		for(Entry<Character,Integer> o : set)
		{
			System.out.println(o.getKey()+" : "+o.getValue());
		}
		//System.out.println(map);
				
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("abcdefg"));
		String s1 = "olleh";
		String s2 = "hello";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		sort(c1);
		sort(c2);
		String s3 = new String(c1);
		String s4 = new String(c2);
		if(s3.equals(s4))
		{
			System.out.println("anagram");
		}else
		{
			System.out.println("not anagram");
		}
		printDuplicateChar("missippi");
		printOccuraneOfChar("missippi kallll");
		
		
	}

}

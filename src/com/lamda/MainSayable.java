package com.lamda;

public class MainSayable {
	public static void main(String[] args) {
		
		Sayable sb = (o1) -> 
		{
			String s1 = "I would like to say ";
			String s2 = s1 + o1;
			return s2;
		};
		System.out.println(sb.say("Time is precious"));
	}

}

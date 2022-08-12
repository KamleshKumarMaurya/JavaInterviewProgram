package com.forLoop;

public class PrimeNUmber {
	public static void main(String[] args) {
		int num = 3;
		for(int i=1; i<100; i++)
		{
			if(primeCheck(i))
			{
				System.out.println(i);
			}
		}
		
	}
	static boolean primeCheck(int num)
	{
		if(num == 0 || num == 1)
		{
			return false;
		}
		for(int i=2; i<=num/2;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}

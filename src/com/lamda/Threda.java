package com.lamda;

public class Threda{
	public static void main(String[] args) {
		Runnable rn = () -> {
			System.out.println("start runnable");
			for(int i=0; i<10;i++)
			{
				System.out.println(i);
			}
			System.out.println("end runnable");
		};
		
		new Thread(rn).start();
	}
}

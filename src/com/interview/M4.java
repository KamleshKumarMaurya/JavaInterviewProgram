package com.interview;

public class M4 {
	public static void main(String[] args) {
		int x=2;
		for(int y=0;y<10;y++) {
			if(y%x==0) {
				System.out.println(y);
				continue;
			}else if(y == 8) {
				break;
			}
		}
		System.out.println(6%5);
	}

}

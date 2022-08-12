package com.lamda;
interface Length
{
	int length(String str);
}
public class M3 {
	public static void main(String[] args) {
		Length l1 = (str) -> str.length();
		System.out.println(l1.length("hello"));
	}

}

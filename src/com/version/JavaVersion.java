package com.version;

public class JavaVersion {
	public static void main(String[] args) {
		System.out.println("Hello world");
		var r = Runtime.version();
		System.out.println("your java version is : "+r.version());
	}

}

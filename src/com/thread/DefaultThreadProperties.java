package com.thread;

public class DefaultThreadProperties {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.isDaemon());
		System.out.println(t.MAX_PRIORITY);
		System.out.println(t.MIN_PRIORITY);
		System.out.println(t.NORM_PRIORITY);
		System.out.println(t.toString());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}

}

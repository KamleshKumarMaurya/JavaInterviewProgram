package com.thread;

public class StateOfThread {
	public static void main(String[] args) {
		Thread.State[] states = Thread.State.values();
		for (Thread.State state : states) {
			System.out.println(state);
		}
	}

}

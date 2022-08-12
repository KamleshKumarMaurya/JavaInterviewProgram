package com.collection.pack1;

import java.util.Stack;

public class QueueDemo2 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(123);
		stack.add(234);
		stack.add(13);
		stack.add(34);
		stack.add(3);
		stack.add(4);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}

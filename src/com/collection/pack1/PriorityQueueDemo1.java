package com.collection.pack1;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(12);
		queue.add(34);
		queue.add(2);
		queue.add(4);
		queue.add(19);
		queue.add(343);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}

}

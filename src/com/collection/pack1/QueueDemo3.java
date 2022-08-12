package com.collection.pack1;

import java.util.Comparator;
import java.util.PriorityQueue;

class Book
{
	int id;  
	String name,author,publisher;  
	int quantity; 
	
	Book(int id, String name, String author, String publisher, int quantity){
		this.id =id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
	
	
}

public class QueueDemo3 {
	public static void main(String[] args) {
		PriorityQueue<Book> queue = new PriorityQueue<Book>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.id - o2.id;
			}
		});
		queue.add(new Book(121,"Let us C","Yashwant Kanetkar","BPB",8));
		queue.add(new Book(233,"Operating System","Galvin","Wiley",6));
		queue.add(new Book(101,"Data Communications","Forouzan","Mc Graw Hill",4));
		
		queue.stream().forEach((o1) -> System.out.println(o1));
		
		System.out.println("removing head element========");
		System.out.println(queue.poll());
		
		System.out.println("After removing ======");
		queue.stream().forEach((o1) -> System.out.println(o1));
	}

}

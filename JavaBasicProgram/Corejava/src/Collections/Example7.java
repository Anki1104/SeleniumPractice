package Collections;

import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;

	}
}

public class Example7 {
	public static void main(String[] args) {
		List<Book> l1 = new ArrayList<Book>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
// Adding Books to list
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));

		System.out.println("List of Book class elements: " + l1);
		System.out.println(l1.get(0).name);
		System.out.println(b2.name);
		for (Book b : l1) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}

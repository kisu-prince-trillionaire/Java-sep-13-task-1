package com.book.collection;
import java.util.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class BookMain {

	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<Book>();
		
		Book book1 = new Book(1,"Rich dad",200,"Rohit");
		Book book2 = new Book(2,"Poor dad",150,"Banti");
		Book book3 = new Book(3,"Grow rich",250,"Ram");
		Book book4 = new Book(4,"Money mind",300,"Shyam");
		Book book5 = new Book(5,"Zero",100,"Jam");
		Book book6 = new Book(6,"hero",400,"vishal");
		
		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		set.add(book5);
		set.add(book6);
		
		for(Book b : set) {
			System.out.println(b);
		}
		
		System.out.println("After Sorting");
		Collection.sort(set, new BookNameComprator());
		for(Book b1 : set) {
			System.out.println(b1);
		}

	}

}

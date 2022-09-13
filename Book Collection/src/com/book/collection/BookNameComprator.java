package com.book.collection;

import java.util.Comparator;

public class BookNameComprator implements Comparator<Book>{
	public int compare(Book book1, Book book2) {
		return book1.getBookName().compareTo(book2.getBookName());
	}

}

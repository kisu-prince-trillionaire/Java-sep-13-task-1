package com.book.collection;

import java.util.Objects;

public class Book {
	private int bookId;
	private String bookName;
	private int bookPrice;
	private String authorName;
	
	public Book() {
		System.out.println("Please provide the book details !");
	}
	
	public Book(int bookId, String bookName, int bookPrice, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName="
				+ authorName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookId, bookName, bookPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName) && bookPrice == other.bookPrice;
	}
	
	
	
	

}

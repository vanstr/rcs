package com.accenture.lecture10;

public class Book {
	private String author;
	private int pages;
	private String title;
	private String review;
	private String authorComments;
	
	private Book book;

	public Book() {
		this("Anderson", 20, "Some book");
	}

	public Book(String author, int pages, String title) {
		this.author = author;
		this.pages = pages;
		this.title = title;
		System.out.println(this.toString());
	}

	public String toString() {
		return "author:" + getAuthor() + " pages:" + getPages() + " title:"
				+ getTitle() + " review: " + this.review;
	}

	public Book(String title) {
		this("Dale Carnegie", 237, title);
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	
	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getAuthorComments() {
		return authorComments;
	}

	public void setAuthorComments(String authorComments) {
		this.authorComments = authorComments;
	}

	public static void main(String[] args) {
		new Book();
		new Book();
		new Book();
		new Book();
		Book jojnBook = new Book("John Smith", 500, "Secret");
		jojnBook.setReview("Quite boring book");
		System.out.println(jojnBook.toString());
	}
}
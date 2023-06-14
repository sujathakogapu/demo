package com.example.collections;
/*
 * Create a class Book with attributes title(String) and author(String). 
 * Two book objects are same, if they have same title and author
 */
public class BookDetails {
	private String title;
	private String author;

	public BookDetails(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		BookDetails book = (BookDetails) obj;
		if (this.title == book.title && book.equals(book.author)) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		int result1 = this.title.hashCode();
		int result2=this.author.hashCode();
		int result=result1+result2;
		return result;
	}

	public static void main(String[] args) {
		BookDetails book1 = new BookDetails("be carefull", "abdulla");
		BookDetails book2 = new BookDetails("be carefull", "abdulla");
		System.out.println(book1.equals(book2));
		System.out.println(".equals():" + book1.equals(book2) + "==" + (book1 == book2));
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}

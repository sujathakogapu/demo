package com.example.fileexamples;

import java.util.ArrayList;
import java.util.List;

public class JBooks {
	 private List<JBook> books = new ArrayList<>();

	    public List<JBook> getBooks() {
	        return books;
	    }

	    public void addBook(JBook book) {
	        books.add(book);
	    }

		@Override
		public String toString() {
			return "JBookStore [books=" + books + ", getBooks()=" + getBooks() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

}

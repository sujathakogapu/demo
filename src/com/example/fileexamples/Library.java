package com.example.fileexamples;

	import java.util.ArrayList;
	import java.util.List;

	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;
	@XmlRootElement(name = "library")
	public class Library {
		private List<LibraryId> books = new ArrayList<>();
		@XmlElement(name = "book")
	    public List<LibraryId> getBooks() {
	        return books;
	    }

	    public void addBook(LibraryId book) {
	        books.add(book);
	    }

	}


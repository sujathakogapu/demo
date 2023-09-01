package com.example.fileexamples;

	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;
	import java.util.List;

	@XmlRootElement(name = "books")
	public class LibraryBookListWrapper {

	    private List<LibraryBookDetails> books;

	    @XmlElement(name = "book")
	    public List<LibraryBookDetails> getBooks() {
	        return books;
	    }

	    public void setBooks(List<LibraryBookDetails> books) {
	        this.books = books;
	    }
	}


package com.example.fileexamples;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "books")
public class LibraryBook {

    private List<LibraryBookDetails> books;

    public LibraryBook() {
        books = new ArrayList<>();
    }

    @XmlElement(name = "book")
    public List<LibraryBookDetails> getBooks() {
        return books;
    }
}











package com.example.fileexamples;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookstore")
public class XBookStore {
    private List<XBook> books = new ArrayList<>();

    @XmlElement(name = "book")
    public List<XBook> getBooks() {
        return books;
    }

    public void addBook(XBook book) {
        books.add(book);
    }
}
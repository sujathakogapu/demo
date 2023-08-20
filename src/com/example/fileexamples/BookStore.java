package com.example.fileexamples;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookstore")
public class BookStore {
    private List<MarshallingExample> books = new ArrayList<>();

    @XmlElement(name = "book")
    public List<MarshallingExample> getBooks() {
        return books;
    }

    public void addBook(MarshallingExample book) {
        books.add(book);
    }
}
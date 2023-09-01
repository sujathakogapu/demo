package com.example.fileexamples;

public class LibraryBookDetails {
    private int bookId;
    private String title;
    private String author;
    private String publication_year;
    private String isbn;
    private String genre;
    private String copies_available;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(String publication_year) {
        this.publication_year = publication_year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCopies_available() {
        return copies_available;
    }

    public void setCopies_available(String copies_available) {
        this.copies_available = copies_available;
    }
}
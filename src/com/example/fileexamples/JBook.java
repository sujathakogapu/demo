package com.example.fileexamples;


public class JBook {
    private String title;
    private String author;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
	public String toString() {
		return "JBook [title=" + title + ", author=" + author + ", price=" + price + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

		
	}

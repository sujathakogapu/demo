package com.example.fileexamples;

	/*
	 * 1. Assignment: write a java program to create and read a xml file using java inbuilt java package called "jaxb"
	 * 
	 */
	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;
	@XmlRootElement(name = "book")
	public class MarshallingExample {
		// Create Java classes to represent the structure of the XML elements.
		 private String title;
		    private String author;
		    private double price;

		    @XmlElement
		    public String getTitle() {
		        return title;
		    }

		    public void setTitle(String title) {
		        this.title = title;
		    }

		    @XmlElement
		    public String getAuthor() {
		        return author;
		    }

		    public void setAuthor(String author) {
		        this.author = author;
		    }

		    @XmlElement
		    public double getPrice() {
		        return price;
		    }

		    public void setPrice(double price) {
		        this.price = price;
		    }
		

	}


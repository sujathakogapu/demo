package com.example.fileexamples;

	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.JAXBException;
	import javax.xml.bind.Unmarshaller;
	import java.io.File;


	public class UnmarshalExample {
		public static void main(String[] args) {
	        try {
	        	//xml -> java object (unmarshalling) -> read operation
	            File file = new File("C:\\Users\\Sujatha\\Documents\\book-store.xml");
	            JAXBContext jaxbContext = JAXBContext.newInstance(BookStore.class);
	            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	            BookStore bookstore = (BookStore) jaxbUnmarshaller.unmarshal(file);
	            // Now you can access the Java objects
	            for (MarshallingExample book : bookstore.getBooks()) {
	                System.out.println("Title: " + book.getTitle());
	                System.out.println("Author: " + book.getAuthor());
	                System.out.println("Price: " + book.getPrice());
	                System.out.println();
	            }
	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	    }

	}


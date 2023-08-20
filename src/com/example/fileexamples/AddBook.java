package com.example.fileexamples;
import java.io.FileReader;
import java.io.FileWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class AddBook {
	 public static void main(String[] args) {
	        try {
	            JAXBContext context = JAXBContext.newInstance(BookStore.class);
	            Unmarshaller unmarshaller = context.createUnmarshaller();
	            BookStore bookstore = (BookStore) unmarshaller.unmarshal(new FileReader("C:\\Users\\Sujatha\\Documents\\book-store.xml"));

	            MarshallingExample newBook = new MarshallingExample();
	            newBook.setTitle("Advanced XML Programming");
	            newBook.setAuthor("David Johnson");
	            newBook.setPrice(49.95);

	            bookstore.addBook(newBook);

	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            marshaller.marshal(bookstore, new FileWriter("C:\\Users\\Sujatha\\Documents\\book-store.xml"));

	            System.out.println("New book added and XML updated.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
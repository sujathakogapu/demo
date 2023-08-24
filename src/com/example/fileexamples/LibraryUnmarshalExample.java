package com.example.fileexamples;

	import java.io.File;

	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.JAXBException;
	import javax.xml.bind.Unmarshaller;

	public class LibraryUnmarshalExample {
		 public static void main(String[] args) {
		        try {
		            // Step 1: Create an instance of JAXB context and unmarshaller
		            JAXBContext context = JAXBContext.newInstance(Library.class);
		            Unmarshaller unmarshaller = context.createUnmarshaller();

		            // Step 2: Unmarshal the XML file into Java objects
		            File xmlFile = new File("C:\\Users\\Sujatha\\Documents\\library.xml");
		            Library library = (Library) unmarshaller.unmarshal(xmlFile);

		            // Step 3: Print the details to the console
		            for (LibraryId book : library.getBooks()) {
		                System.out.println("Book ID: " + book.getId());
		                System.out.println("Title: " + book.getTitle());
		                System.out.println("Author: " + book.getAuthor());
		                System.out.println("Publication Year: " + book.getPublicationYear());
		                System.out.println("Genre: " + book.getGenre());

		                // Check if availability information exists
		                if (book.getAvailability() != null) {
		                    System.out.println("Availability Status: " + book.getAvailability().getStatus());
		                    System.out.println("Due Date: " + book.getAvailability().getDueDate());
		                    System.out.println("Borrower: " + book.getAvailability().getBorrower());
		                }

		                System.out.println();
		            }
		        } catch (JAXBException e) {
		            e.printStackTrace();
		        }
		    }


	}


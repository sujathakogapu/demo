package com.example.fileexamples;

	import java.io.File;

	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.JAXBException;
	import javax.xml.bind.Marshaller;
	import javax.xml.bind.Unmarshaller;

	public class LibraryMarshalExample {
		  public static void main(String[] args) {
		        try {
		            // Step 1: Read the existing XML and unmarshal it into Java objects
		            JAXBContext context = JAXBContext.newInstance(Library.class);
		            Unmarshaller unmarshaller = context.createUnmarshaller();

		            File xmlFile = new File("C:\\Users\\Sujatha\\Documents\\library.xml");
		            Library library = (Library) unmarshaller.unmarshal(xmlFile);
					LibraryAvailability availability = new LibraryAvailability();
		            availability.setStatus("checked_in");
		            availability.setDueDate("2023-09-25");
		            availability.setBorrower("john");

		            // Step 2: Create a new book and add it to the library
		            LibraryId newBook = new LibraryId();
		            newBook.setId("004");
		            newBook.setTitle("The Great Gatsby");
		            newBook.setAuthor("Harper Lee");
		            newBook.setPublicationYear("2023-08-2010");
		            newBook.setGenre("Novel");
					newBook.setAvailability(availability);

		            // You can also set availability for the new book if needed

		            library.addBook(newBook);

		            // Step 3: Marshal the updated library back to XML
		            Marshaller marshaller = context.createMarshaller();
		            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		            marshaller.marshal(library, xmlFile);
		            System.out.println("New book added successfully.");
		        } catch (JAXBException e) {
		            e.printStackTrace();
		        }
		    }


	}


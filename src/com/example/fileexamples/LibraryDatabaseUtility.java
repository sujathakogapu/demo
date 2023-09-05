package com.example.fileexamples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LibraryDatabaseUtility {

	private Connection connection;

	public LibraryDatabaseUtility(Connection connection) {
		this.connection = connection;
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		String dbName = "libraryOrganization";
		String userName = "root";
		String passWord = "root";
		String url = "jdbc:mysql://localhost:3306/" + dbName;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, passWord);

		connection.setAutoCommit(true);
		return connection;
	}

	private List<Integer> convertCsvToDb(String csvFile) {
	    String insertQuery = "insert into bookOrganization(title, author, publicationYear, isbn, genre, copiesAvailable) VALUES (?, ?, ?, ?, ?, ?)";
	    List<Integer> generatedBookIds = new ArrayList<>();

	    try (CSVReader reader = new CSVReader(new FileReader(csvFile));
	         PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {

	        // Skip the header line in the CSV file
	        reader.readNext();

	        String[] nextLine;
	        while ((nextLine = reader.readNext()) != null) {
	            if (nextLine.length >= 6) {
	                for (int i = 0; i < 6; i++) {
	                    preparedStatement.setString(i + 1, nextLine[i]);
	                }
	                preparedStatement.executeUpdate();

	                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
	                    if (generatedKeys.next()) {
	                        int bookId = generatedKeys.getInt(1);
	                        generatedBookIds.add(bookId);
	                    }
	                }
	            } else {
	                System.out.println("Skipping incomplete line: " + String.join(", ", nextLine));
	            }
	        }

	        System.out.println("CSV data inserted into the database successfully.");
	    } catch (IOException | CsvValidationException | SQLException e) {
	        e.printStackTrace();
	    }

	    return generatedBookIds;
	}
	public List<LibraryBookDetails> getAllBooks() {
	    List<LibraryBookDetails> bookList = new ArrayList<>();
	    String query = "select * from bookOrganization"; // Corrected table name

	    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

	        while (resultSet.next()) {
	            LibraryBookDetails bookDetails = new LibraryBookDetails();
	            bookDetails.setBookId(resultSet.getInt("bookId"));
	            bookDetails.setTitle(resultSet.getString("title"));
	            bookDetails.setAuthor(resultSet.getString("author"));
	            bookDetails.setPublicationYear(resultSet.getString("publicationYear"));
	            bookDetails.setIsbn(resultSet.getString("isbn"));
	            bookDetails.setGenre(resultSet.getString("genre"));
	            bookDetails.setCopiesAvailable(resultSet.getString("copiesAvailable")); // Corrected field name

	            bookList.add(bookDetails);
	            System.out.println("Book ID: " + bookDetails.getBookId());
	            System.out.println("Title: " + bookDetails.getTitle());
	            System.out.println("Author: " + bookDetails.getAuthor());
	            System.out.println("Publication Year: " + bookDetails.getPublicationYear());
	            System.out.println("ISBN: " + bookDetails.getIsbn());
	            System.out.println("Genre: " + bookDetails.getGenre());
	            System.out.println("Copies Available: " + bookDetails.getCopiesAvailable());
	            System.out.println();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return bookList;
	}

	public void convertListToJson(List<LibraryBookDetails> bookList, String jsonFilePath) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(bookList);

		try (FileWriter fileWriter = new FileWriter(jsonFilePath)) {
			fileWriter.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("convert db to json successfully");
	}

	public void convertListToXml(List<LibraryBookDetails> bookList, String xmlFilePath) {
		try {
			LibraryBookListWrapper wrapper = new LibraryBookListWrapper();
			wrapper.setBooks(bookList);

			JAXBContext context = JAXBContext.newInstance(LibraryBookListWrapper.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(wrapper, new File(xmlFilePath));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		System.out.println("convert db to xml successfully");
	}

	public static void main(String[] args) {
		String csvFile = "C:\\Users\\Sujatha\\Documents\\bookLibrary.csv";

		try (Connection connection = getConnection()) {
			LibraryDatabaseUtility dbUtility = new LibraryDatabaseUtility(connection);

			// Convert CSV to DB (if needed)
			dbUtility.convertCsvToDb(csvFile);

			// Read data from DB
			List<LibraryBookDetails> bookList = dbUtility.getAllBooks();

			// Convert to JSON
			dbUtility.convertListToJson(bookList, "C:\\Users\\Sujatha\\Documents\\LibraryBookJsonfile.json");

			// Convert to XML
			dbUtility.convertListToXml(bookList, "C:\\Users\\Sujatha\\Documents\\librarybooxmlfile.xml");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

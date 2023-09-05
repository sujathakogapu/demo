package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializationExample {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (Reader reader = new FileReader("C:\\Users\\Sujatha\\Documents\\book-store.json")) {
			BufferedReader br = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			String json = sb.toString();

			// Deserialize the JSON string into a JBookStore object
			JBookStore obj = gson.fromJson(json, JBookStore.class);

			// Create a new JBook instance and set its properties
			JBook newBook = new JBook();
			newBook.setTitle("java");
			newBook.setAuthor("james");
			newBook.setPrice(50.95);

			// Add the new book to the existing JBookStore
			obj.getBookstore().addBook(newBook);

			// Serialize the modified JBookStore object to JSON string
			String newJson = gson.toJson(obj);

			// Write the JSON string back to the original file to modify it
			try (FileWriter writer = new FileWriter("C:\\Users\\Sujatha\\Documents\\output.json")) {
				writer.write(newJson);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			System.err.println("An error occurred while reading the file:");
			e.printStackTrace();
		}
		System.out.println("add the new book successfully");
	}
}

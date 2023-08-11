package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFreqtInDescOrder {
	public static void main(String[] args) {
		// Path to the input text file
		String filePath = "C:\\Users\\Sujatha\\Desktop\\poem.txt";

		try {
			// Open a file reader and buffered reader to read the file
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			// Initialize variables
			String poem = " ";
			String line;
			// Read each line of the file and concatenate them to form the poem text
			while ((line = br.readLine()) != null) {
				poem += line + " ";
			}
			br.close();

			// Create a map to store word frequencies
			Map<String, Integer> wordFrequency = new HashMap<>();

			// Split the poem text into individual words
			String[] words = poem.toString().split("\\s+");

			// Calculate word frequencies
			for (String word : words) {
				// Process the word: convert to lower case and remove non-alphabetic characters
				word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

				// Check if the word is not empty
				if (!word.isEmpty()) {
					// Update word frequency in the map
					wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
				}
			}

			// Create a list of map entries for sorting
			List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());

			// Sort the list in descending order based on values (frequencies)
			sortedEntries.sort(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()));

			// Print the sorted word frequencies
			for (Map.Entry<String, Integer> entry : sortedEntries) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}

		} catch (FileNotFoundException e) {
			// Print error if the file is not found
			e.printStackTrace();
		} catch (IOException e) {
			// Print error if an IO issue occurs while reading the file
			e.printStackTrace();
		}
	}
}
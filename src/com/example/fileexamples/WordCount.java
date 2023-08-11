package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\Sujatha\\Desktop\\poem.txt";
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String poem = " ";
			StringBuilder text = new StringBuilder();

			while ((poem = br.readLine()) != null) {
				text.append(poem).append("\n");
				// System.out.println(poem);
			}
			br.close();
			Map<String, Integer> wordFrequency = new HashMap<>();
			String[] words = text.toString().split("\\s+");

			for (String word : words) {
				word = word.toLowerCase().replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
				if (!word.isEmpty()) {
					wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
				}
			}

			// Print word frequency count
			// for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			// System.out.println(entry.getKey() + ": " + entry.getValue());
			// }

			// user to enter a word
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a word: ");
			String inputWord = scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");

			if (!inputWord.isEmpty()) {
				int frequency = wordFrequency.getOrDefault(inputWord, 0);
				System.out.println("Frequency of the word: '" + inputWord + "': " + frequency);
			} else {
				System.out.println("Invalid input word... enter a proper word: ");
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

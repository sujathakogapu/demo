package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileProcessingExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sujatha\\Desktop\\poem.txt";
        String outputFilePath = "C:\\Users\\Sujatha\\Desktop\\output.txt";

        Map<String, Integer> wordFrequency = new HashMap<>();
        wordFrequenciesCount(filePath, wordFrequency);

        System.out.println("Word Frequencies:");
        printWordDescendingFrequencies(wordFrequency);

        writeWordFrequency(outputFilePath, wordFrequency);
        System.out.println("Word frequencies written to output file: " + outputFilePath);

        countAndPrintLines(filePath);
        System.out.println("Lines Count: " + countLines(filePath));

        String actualWord = "wordToReplace"; // Replace with the actual word
        String replacementWord = "newWord";  // Replace with the replacement word
        findAndReplace(filePath, actualWord, replacementWord);

        System.out.println("Longest word: " + findLongestWord(filePath));

        reverseAndPrintLines(filePath);
    }

    public static void wordFrequenciesCount(String filePath, Map<String, Integer> wordFrequency) {
    	BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                    	int count=wordFrequency.getOrDefault(word, 0) + 1;
                        wordFrequency.put(word, count);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        	try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }

    public static void printWordDescendingFrequencies(Map<String, Integer> wordFrequency) {
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());
        sortedEntries.sort(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void writeWordFrequency(String outputFilePath, Map<String, Integer> wordFrequency) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                bw.write("The frequency of the word: " + entry.getKey() + " " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countLines(String filePath) {
        int linesCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) {
                linesCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesCount;
    }

    public static void countAndPrintLines(String filePath) {
        int linesCount = countLines(filePath);
        System.out.println("Lines Count: " + linesCount);
    }

    public static void findAndReplace(String filePath, String actualWord, String replacementWord) {
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();

            String modifiedContent = content.toString().replaceAll("\\b" + actualWord + "\\b", replacementWord);

            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(modifiedContent);
            bw.close();

            System.out.println("Replacement complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findLongestWord(String filePath) {
        String longestWord = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestWord;
    }

    public static void reverseAndPrintLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();

            Collections.reverse(lines);

            System.out.println("Reversed Lines:");
            for (String reversedLine : lines) {
                System.out.println(reversedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
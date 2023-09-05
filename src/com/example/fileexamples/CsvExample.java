
package com.example.fileexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CsvExample {
	public static void main(String[] args) {
		String csvFile = "C:\\Users\\Sujatha\\Desktop\\persons.csv";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter actual string: ");
		String actual = sc.next();
		System.out.print("Enter the string to replace: ");
		String replace = sc.next();
		sc.close();

		readCsv(csvFile);
		String name="sujatha";
		int age=26;
		String location="hyderabad";
		writeCsv(csvFile,name,age,location);
		countOccurrences(csvFile, "sujatha");
		findAndReplace(csvFile, actual, replace);
		countLines(csvFile);
	}

	public static void readCsv(String csvFile) {
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					for (String value : nextLine) {
						System.out.print(value + ", ");
					}
					System.out.println(); 
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeCsv(String csvFile, String name, int age, String location) {
		try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            String[] record = {name, String.valueOf(age), location};
            writer.writeNext(record);
        } catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void countOccurrences(String csvFile, String word) {
		int occurrenceCount = 0;

		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					for (String value : nextLine) {
						if (value.equals(word)) {
							occurrenceCount++;
						}
					}
				}
				System.out.println("Occurrences of '" + word + "': " + occurrenceCount);
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void findAndReplace(String csvFile, String findWord, String replaceWord) {
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					for (int i = 0; i < nextLine.length; i++) {
						nextLine[i] = nextLine[i].replace(findWord, replaceWord);
						System.out.print(nextLine[i] + ", ");
					}
					System.out.println(); // Move to the next line after printing a row
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void countLines(String csvFile) {
		int lineCount = 0;
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
			try {
				while (reader.readNext() != null) {
					lineCount++;
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Line count: " + lineCount);
	}
}
package com.example.collections;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
7.Write a program to replace all occurrences of a specific substring in an
  ArrayList of strings.
  Input:
  [Apple,Banana,Mango,Orange]
  Substring to replace: an
  New substring: **
  Output:
ArrayList after replacing an with **:[Apple,B****a,M**go,Or**ge]
 */

public class ReplaceSubString {
	public ArrayList<String> replaceSubStrings(ArrayList<String> obj, String subStr, String newString) {
		ArrayList outputStrings = new ArrayList();
		for (int i = 0; i < obj.size(); i++) {
			String val = (String) obj.get(i);
			String output = val.replaceAll(subStr, newString);
			outputStrings.add(output);
		}
		return outputStrings;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of strings: ");
		int size = scanner.nextInt();
		ArrayList<String> obj = new ArrayList<>();
		System.out.println("Enter a strings:");
		String inputStr = scanner.nextLine();
		for (int i = 0; i < size; i++) {
			obj.add(scanner.nextLine());
		}
		System.out.println("Enter a substrings: ");
		String subStr = scanner.nextLine();
		System.out.println("Enter a new subString");
		String newString = scanner.nextLine();
		scanner.close();
		ReplaceSubString rplsub = new ReplaceSubString();
		ArrayList<String>output = rplsub.replaceSubStrings(obj, subStr, newString);
		System.out.println(obj.size() + " " + output);
	}

}

package com.example.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
32. Write a program to check if two strings are anagrams using a HashMap.
    Input:
    String 1: "listen"
    String 2: "silent"
    Output:
The strings are anagrams
*/

public class AnagramsHashMap {
	public boolean isAnagrams( String str1, String str2) {
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2) {
			return false;
	}
		Arrays.sort(str1);
		Arrays.sort(str2);

return true;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap map=new HashMap();
		System.out.println("Enter a first string: ");
		String str1=scanner.nextLine();
		System.out.println("Enter a second string: ");
		String str2=scanner.nextLine();
		AnagramsHashMap obj=new AnagramsHashMap();
	}

}

package com.example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
22. Write a program to check if two strings are anagrams using a HashMap.
    Input:
    String 1: "listen"
    String 2: "silent"
    Output:
The strings are anagrams
*/

public class AnagramsHashMap {
	public boolean isAnagrams(HashMap map1,HashMap map2,String str1,String str2) {
		HashMap <String> hmap=new HashMap<>();
		HashMap <String> hmap2=new HashMap<>();
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2) {
			return false;
	}
		for(Character c:str1.toCharArray()) {
			map1.add(c);
		}
		for(Character c:str2.toCharArray()) {
			map2.add(c);
		}
		Collections.sort(map1);
		Collections.sort(map2);
		if(map1.equals(map2)) {
		return true;
		}else
			return false;
	}
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a first string: ");
		String str1=scanner.nextLine();
		System.out.println("Enter a second string: ");
		String str2=scanner.nextLine();
		HashMap <String> map1=new HashMap<>();
		HashMap <String> map2=new HashMap<>();
		for(Character c:str1.toCharArray()) {
			map1.add(c);
		}
		for(Character c:str2.toCharArray()) {
			map2.add(c);
		}
		Collections.sort(map1);
		Collections.sort(map2);
		if(map1.equals(map2)) {
			System.out.println("Given Strings are Anagrams");
		}else
			System.out.println("Given Strings are not anagrams");
	}

}

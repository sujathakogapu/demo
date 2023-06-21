package com.example.collections;
/*
 * 11. Write a program to count the frequency of each character in a given
string using a HashMap.
Input:
String: "Hello World!"
Output:
Character frequency:
'H': 1
'e': 1
'l': 3
'o': 2
' ': 1
'W': 1
'r': 1
'd': 1
'!': 
 */
            
            
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
	//method creation 
		public LinkedHashMap<Character, Integer> charCountFrequency(String Str,LinkedHashMap<Character, Integer>charFreqMap) {
			//logic for frequency chars
			//loop for take length given string
			for (int i = 0; i < Str.length(); i++) {
				//each char assign in ch variable
				Character ch = Str.charAt(i);
				//charfreqmap contains ch then count is increment
				if (charFreqMap.containsKey(ch)) {
					int count = charFreqMap.get(ch);
					charFreqMap.put(ch, count + 1);
					//else count is put in ch
				} else {
					charFreqMap.put(ch, 1);
				}
			}
			//return charFreqMap
			return charFreqMap;
		}

		public static void main(String[] args) {
			//take inputs from user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string:");
			String Str = sc.nextLine();
			// LinkedHashMap object creation
			LinkedHashMap<Character,Integer> charFreqMap=new LinkedHashMap<>();
			//main class object creation
			FrequencyOfEachCharacter Obj = new FrequencyOfEachCharacter();
			//method calling
			LinkedHashMap<Character, Integer> Output = Obj.charCountFrequency(Str,charFreqMap);
			//output print
			System.out.println("Character frequency:"+ charFreqMap);
			sc.close();
		}

	}
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
		public LinkedHashMap<Character, Integer> charCountFrequency(String Str,LinkedHashMap<Character, Integer>charFreqMap) {
			for (int i = 0; i < Str.length(); i++) {
				Character ch = Str.charAt(i);
				if (charFreqMap.containsKey(ch)) {
					int count = charFreqMap.get(ch);
					charFreqMap.put(ch, count + 1);
				} else {
					charFreqMap.put(ch, 1);
				}
			}
			return charFreqMap;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string:");
			String Str = sc.nextLine();
			LinkedHashMap<Character,Integer> charFreqMap=new LinkedHashMap<>();
			FrequencyOfEachCharacter Obj = new FrequencyOfEachCharacter();
			LinkedHashMap<Character, Integer> Output = Obj.charCountFrequency(Str,charFreqMap);
			System.out.println("Character frequency:"+ charFreqMap);
			sc.close();
		}

	}
package com.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
 * 13. Write a program to count the frequency of words in a sentence using a
HashMap.
Input:
Sentence: "I love to code and I love to learn."
Output:
Word frequency:
"I": 2
"love": 2
"to": 2
"code": 1
"and": 1
"learn": 1

 */
public class FrequencyOfWords {
	//method creation
	public LinkedHashMap<String,Integer> getWordsFrequency(String str){
		//linkedHashMap object creation with genirics
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
		//split the words for given string using split method and assign in String array
		String[] words=str.split(" ");
		//create for each loop count the words
		for(String word:words) {
			//if contains word then count is increment and put in linkedHashmap object
			if(linkedHashMap.containsKey(word)) {
				int count=linkedHashMap.get(word);
				count++;
				linkedHashMap.put(word,count);
			}
			//else count is constant
			else
				linkedHashMap.put(word,1);
		}
		//return thr map
		return linkedHashMap;
	}
	public static void main(String[] args) {
		//take input from user
		Scanner scanner=new Scanner(System.in);
		//LinkedHashMap object creation
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		System.out.println("Enter a sentence: ");
		String str=scanner.nextLine();
		//main class object creation
		FrequencyOfWords obj=new FrequencyOfWords();
		//method calling
		LinkedHashMap<String,Integer> lmap=obj.getWordsFrequency(str);
		//print output
		System.out.println("Word frequency: "+lmap);
	}
		}
		


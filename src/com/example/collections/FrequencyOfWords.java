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
	public LinkedHashMap<String,Integer> getWordsFrequency(String str){
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
		String[] words=str.split(" ");
		for(String word:words) {
			if(linkedHashMap.containsKey(word)) {
				int count=linkedHashMap.get(word);
				count++;
				linkedHashMap.put(word,count);
			}
			else
				linkedHashMap.put(word,1);
		}
		return linkedHashMap;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		System.out.println("Enter a sentence: ");
		String str=scanner.nextLine();
		FrequencyOfWords obj=new FrequencyOfWords();
		LinkedHashMap<String,Integer> lmap=obj.getWordsFrequency(str);
		System.out.println("Word frequency: "+lmap);
	}
		}
		


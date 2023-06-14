package com.example.collections;
/*
 * 29. Write a Java program to replace the value of a specific key in a
LinkedHashMap.
Input:
LinkedHashMap: {A=1, B=2, C=3}
Key to replace: B
New value: 5
Output:
LinkedHashMap after replacement: {A=1, B=5, C=3}
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ReplaceLinkedHashMap {
	public LinkedHashMap<Character,Integer> replceValue(LinkedHashMap<Character,Integer> map ,char key, int value) {
		LinkedHashMap<Character,Integer> map1=new LinkedHashMap<>();
		map.replace(key,value);
		
		return map;
	}
	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter key to replace: ");
		//char key =scanner.nextChar();
		map.put('A', 1);
		map.put('B', 2);
		map.put('c', 3);
		System.out.println("before replace: "+map);
		ReplaceLinkedHashMap obj=new ReplaceLinkedHashMap();
		char key=0;
		int value = 0;
		LinkedHashMap<Character,Integer> outputMap=obj.replceValue(map,key, value);
		System.out.println("LinkedHashMap after replacement: "+outputMap);
	}

}

package com.example.collections;
/*
 * 30. Write a Java program to convert a LinkedHashMap to a TreeMap.
Input:
LinkedHashMap: {C=3, A=1, B=2}
Output:
TreeMap: {A=1, B=2, C=3}
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ConvertLinkedMapToTreeMap {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		HashMap<String,Integer> map=new HashMap<>();
		scanner.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Enter a key: ");
			String key=scanner.nextLine();
			System.out.println("Enter a value: ");
			int value=scanner.nextInt();
			map.put(key,value);
			scanner.nextLine();
		}
		System.out.println("HashMap: "+map);
		TreeMap<String,Integer> tmap=new TreeMap<>();
		tmap.get(map);
		//tmap.add(map);
		System.out.println("TreeMap: "+tmap);
	}

}

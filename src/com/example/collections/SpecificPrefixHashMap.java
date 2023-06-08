package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 20. Write a program to remove all entries from a HashMap where the key
starts with a specific prefix.
Input:
HashMap: {apple=10, banana=5, orange=8, avocado=15}
Prefix to remove: a
Output:
HashMap after removal: {banana=5, orange=8}
 */

public class SpecificPrefixHashMap {
	public HashMap<String,Integer> getPrefixRemove(HashMap<String,Integer>map, String Prefix) {
		Object key = null;
			//for(int i=0;i<map.size();i++) {
			int fruits= map.get(key);
			if(Prefix==key) {
				map.remove(key);
			}
			//}
		return map;
	}
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
		for (String fruit : map.keySet()) {
			System.out.println(map);
		}
		
		System.out.println("Enter a prefix: ");
		String prefix=scanner.toString();
		SpecificPrefixHashMap obj=new SpecificPrefixHashMap();
		HashMap outputMap=obj.getPrefixRemove(map, prefix);
		System.out.println("HashMap After remove: "+outputMap);
		
	}

}

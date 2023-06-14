package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 24. Write a Java program to get the value associated with a specific key
in a TreeMap.
Input:
TreeMap: {Apple=Red, Banana=Yellow, Orange=Orange}
Key to retrieve value: Banana
Output:
Value associated with key Banana: Yellow

 */
public class AssociatedSpecificKey {
	public TreeMap<String,String> getSpecificKeyValue(TreeMap<String, String> map){
		TreeMap<String,String> treeMap=new TreeMap<>();
		for(int i=0;i<map.size();i++) {
			//Object retriveVal = null;
			//treeMap.get(retriveVal);
			treeMap.get("banana");
		}
		return treeMap;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		TreeMap<String,String> map=new TreeMap<>();
		scanner.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Enter a key: ");
			String key=scanner.nextLine();
			System.out.println("Enter a value: ");
			String value=scanner.nextLine();
			map.put(key,value);
			scanner.nextLine();
		}
		System.out.println("Key to retrieve value: ");
		String retriveVal=scanner.nextLine();
		for (String fruit : map.keySet()) {
			System.out.println(map);
		}
		AssociatedSpecificKey obj=new AssociatedSpecificKey();
		TreeMap<String,String> treeMap1=obj.getSpecificKeyValue(map);
		System.out.println("Value associated with key Banana: "+treeMap1);
		System.out.println("The Value is: " + map.get("banana"));
	}

}

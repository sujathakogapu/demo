package com.example.collections;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("mango", "Andhrapradesh");
		map.put("orange", "maharastra");
		map.put("banana", "karnataka");
		map.put("apple", "kashmir");
		System.out.println(map);
		for (Object fruit : map.keySet()) {
			// System.out.print(fruit+" ");
			// System.out.print(map.get(fruit));
			// System.out.println();
		}
		// System.out.println(map.get("apple"));
		System.out.println("Removing banana: ");
		map.remove("banana");
		System.out.println(map);
		System.out.println("Mango is replace to Tamilnaadu: ");
		map.replace("mango", "Tamilnaadu");
		System.out.println(map);
		System.out.println(map.get("grapes"));
		System.out.println(map.size());
	}

}

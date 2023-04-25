package com.example.strings;

public class StringsMethods {
	public static void main(String[] args) {
		String str1 = "Jai Sree Ram";
		String str2 = "Jai Hanuman";
		char[] ch = { 's', 'h', 'i', 'v', 'a' };
		String str = new String(ch);
		System.out.println(str1 + " " + str2 + " " + str);
		// string methods
		char ch1 = str1.charAt(2);
		System.out.println(ch1);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.contains(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.indexOf(3));
		System.out.println(str1.indexOf(str2));
		System.out.println(str1.indexOf(4, 0));
		System.out.println(str1.intern());
		System.out.println(str1.lastIndexOf(3));
		System.out.println(str1.lastIndexOf(str));
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str.length());
		System.out.println(str1.replace('r', 's'));
		System.out.println(str1.startsWith(str, 'j'));
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.substring(2));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
		System.out.println(str1 + str2 + str);

	}
}
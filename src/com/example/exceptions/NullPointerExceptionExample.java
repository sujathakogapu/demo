package com.example.exceptions;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = null;
		String str2 = "sujatha";
		try {
			System.out.println(str.compareTo(str2));
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		System.out.println("Rest of the program executed");
	}

}

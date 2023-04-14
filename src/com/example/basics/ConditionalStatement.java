package com.example.basics;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enetr a gender:");
		String gender = scanner.next();
		if (gender.equals("female")) {
			System.out.println("Can apply for care taker job");
		} else {
			System.out.println("can not apply for care taker job");
		}
		scanner.close();
	}

}

package com.example.basics;

public class GradeSwitchStatements {
	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("exallent");
			break;
		case 'B':
			System.out.println("good job");
			break;
		case 'C':
			System.out.println("you can better");
			break;
		case 'D':
		case 'E':
			System.out.println("you need to improve");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}
	}

}

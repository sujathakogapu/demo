package com.example.customexceptions;

import java.util.Scanner;

public class VoterId {
	public String getVoterId(int age) throws NotAValidVoterException  {
		if (age < 18) {
			throw new NotAValidVoterException("not a valid voter");
		} else {
			return "abc123";
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age = scanner.nextInt();
		scanner.close();
		VoterId obj = new VoterId();
		String output = null;
		try {
			output = obj.getVoterId(age);
			System.out.println("voterId " + output);
		} catch (NotAValidVoterException nav) {
			nav.printStackTrace();
		}

	}

}

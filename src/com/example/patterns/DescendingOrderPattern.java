package com.example.patterns;

/*
17. Print descending order pattern using nested loops.
    Input:
    Enter the number of rows: 5
    Output:
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
*/
import java.util.Scanner;

public class DescendingOrderPattern {
	public int getDescendingOrder(int row) {
		for (int i = row; i >= 1; i--) {// 54321
			for (int j = row; j >= i; j--) {
			}
		}
		return row;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");// 5
		int row = scanner.nextInt();
		DescendingOrderPattern obj = new DescendingOrderPattern();
		int output= obj.getDescendingOrder(row);
		System.out.print(output);// 5,
		System.out.println();
		scanner.close();
	}
}

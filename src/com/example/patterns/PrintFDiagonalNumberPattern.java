package com.example.patterns;
/*
20. Print diagonal number pattern using nested loops.
    Input:
    Enter the number of rows: 5
    Output:
    1 0 0 0 0
    0 2 0 0 0
    0 0 3 0 0
    0 0 0 4 0
    0 0 0 0 5
*/
import java.util.Scanner;
public class PrintFDiagonalNumberPattern {
	public void printFDiagonalNumber(int row) {
		for (int i = 1; i <= row; i++) {// first iteration:i=1,2,3,4,5
			for (int j = 1; j <= row; j++) // j=12345,12345,12345,12345,123455
				if (j == i) // 1,2,3,4,5
					System.out.print(i + "");// iteration:first:1,second:2,third:3,fourth:4,fifth:5
				else
					System.out.print("0");//10000,02000,00300,00040,00005
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		PrintFDiagonalNumberPattern obj=new PrintFDiagonalNumberPattern();
		obj.printFDiagonalNumber(row);
		scanner.close();
	}
}

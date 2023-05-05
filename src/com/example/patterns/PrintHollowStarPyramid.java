package com.example.patterns;
/*
13. Print hollow star pyramid using nested loops.
    Input:
    Enter the number of rows: 5
    Output:
    *
   * *
  *   *
 *     *
*********
*/
import java.util.Scanner;

public class PrintHollowStarPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {//1,2,3,4,5
			for (int j = 1; j <= row - i; j++)//1234,123,12,1
			{
				System.out.print(" ");//space->4times,3times,2times,1time
			}
			if (i == 1 || i == row)//(1 5)->true,(2,5)->flase
				for (int j = 1; j <= i * 2 - 1; j++)//1
				{
					System.out.print("*");//*
				}
			else {
				for (int j = 1; j <= i * 2 - 1; j++)//1,3,5,7,9
				{
					if (j == 1 || j == i * 2 - 1)//
						System.out.print("*");//
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();

	}
}

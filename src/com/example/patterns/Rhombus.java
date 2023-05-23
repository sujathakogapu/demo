package com.example.patterns;

/*
19. Print Rhombus pattern using nested loops.
    Input:
    Enter the number of rows: 5
    Output:
    ******
   ******
  ******
 ******
******
*/
import java.util.Scanner;

public class Rhombus {
	public void printRhombus(int row) {
		for (int i = 1; i <= row; i++) {// first iteration:i=1,second:i=2,third:i=3,fouth:i=4,fifth:i=5
			for (int j = i; j < row; j++) {// j=1,2,3,4
				System.out.print(' ');// first:space space space space,second: spece spece spece, third:space
										// spece,fourth:space,fifth: j<rows->false
			}
			for (int j = 1; j <= row; j++) {// j=1,2,3,4,5,second:1,2,3,4,5,third:1,2,3,4,5,fourth:1,2,3,4,5
				System.out.print('*');// *****,*****,*****,*****,*****
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of rows:");// 5
		int row = scanner.nextInt();
		Rhombus obj=new Rhombus();
		obj.printRhombus(row);
		scanner.close();
	}
}

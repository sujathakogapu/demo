package com.example.basics;
public class LoopExamples{
	public static void main(String[] args) {
		// example of for loop
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		// example of a while loop
		int j = 0;
		while (j < 5) {
			System.out.print(j);
			j++;
		}
		//while (j > 0) {
			//System.out.println(j);
			//j--;
		//}
		// example of a do-while loop
		int k = 5;
		do {
			System.out.print(k);
			k++;
		} while (k < 5);
	}

}

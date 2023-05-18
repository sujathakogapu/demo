package com.example.strings;

import java.util.Scanner;
/*
22. Write a Java program to find the common characters between two given
    strings.
    Input:
    Enter first string: hello
    Enter second string: world
    Output:
    Common characters: lo
 */
public class CommonCharcterinGivenStrings {
	public  String getCommonCharcter(String inputStr1, String inputStr2)
	{
		String commonChar="";
		for (int i = 0; i < inputStr1.length(); i++) {//h,e,l,l,o
			for (int j = 0; j < inputStr2.length(); j++) {//w,o,r,l,d
				if (inputStr1.charAt(i) == inputStr2.charAt(j)) {//h==w,o,r,l,d->false,e==w,o,r,l,d->false,l==w,o,r,l,d->true,l==w,o,r,l,d->true,o==w,o,r,l,d->false
					String inputString = "";
					commonChar=commonChar+inputString.charAt(i);
				}
			
			}
		}
		return commonChar;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String:");//hello
		String inputStr1 = scanner.nextLine();
		System.out.println("Enter the second string:");//world
		String inputStr2 = scanner.nextLine();
		CommonCharcterinGivenStrings obj=new CommonCharcterinGivenStrings();
		String outputString=obj.getCommonCharcter(inputStr1, inputStr2);
		System.out.print("Common characters:" + outputString);
		scanner.close();
	}
}

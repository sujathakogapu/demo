package com.example.collections;
/*
 * 11. Write a program to count the frequency of each character in a given
string using a HashMap.
Input:
String: "Hello World!"
Output:
Character frequency:
'H': 1
'e': 1
'l': 3
'o': 2
' ': 1
'W': 1
'r': 1
'd': 1
'!': 
 */
            
            
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	HashMap<String,Integer> map=new HashMap<>();
	System.out.println("Enter a string: ");
	String str=scanner.nextLine();
	int[] freq=new int[str.length()];
	char String[]=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		freq[i]=1;
		for(int j=i+1;j<str.length();j++) {
			if(String[i]==String[j]) {
				freq[i]++;
			}
			String[j]='0';
			
		}
	}
System.out.println("frequency chars: ");
for(int i=0;i<freq.length;i++) {
	if(String[i]!=' '&& String[i]!='0')
		System.out.println(String[i]+"-"+freq[i]);
}
}
}

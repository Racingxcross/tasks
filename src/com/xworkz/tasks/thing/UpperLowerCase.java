package com.xworkz.tasks.thing;

import java.util.Scanner;

public class UpperLowerCase {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any String");
	
	String input = sc.nextLine();
	char[] word = input.toCharArray();
	for (int a = 0; a < word.length; a++) {
		if (word[a]>='A'&& word[a]<='z') {
			word[a]=(char)((int)word[a]+32);
		
		 	sc.close();
			System.out.print(word[a]);
			
		}
	}
 	
}
}

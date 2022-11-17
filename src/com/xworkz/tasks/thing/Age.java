package com.xworkz.tasks.thing;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner age1= new Scanner(System.in);
		System.out.println("Enter father age");
		int a = age1.nextInt();
		System.out.println("Enter Son age");
		int b = age1.nextInt();
		if (a == (2 * b)) {
			System.out.println("Father age is double of Son age");
		} else {
			System.out.println("Father age is not double of Son age");
		}
	}
}

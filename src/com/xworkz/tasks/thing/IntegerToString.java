package com.xworkz.tasks.thing;

public class IntegerToString {

	public static void main(String args[]) {
		int a = 1234;
		int b = -1234;

		String num1 = Integer.toString(a);
		String num2 = Integer.toString(b);

		System.out.println("String num1 = " + num1);
		System.out.println("String num2 = " + num2);
	}
}

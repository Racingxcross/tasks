package com.xworkz.tasks.thing;

public class SwapString {
public static void main(String[] args) {
	String str ="Good" , str1 ="morning";
	System.out.println("String before swapping: " + str +" " + str1);
	str=str+str1;
	str1=str.substring( 0, (str.length() -str1.length()));
	str = str.substring(str1.length());
	System.out.println("String after swapping:" + str +" "+ str1);
}
}

package com.xworkz.tasks.thing;

public class Task1 {
	public static class ReverseWords {
	    public static void main(String args[]) {
	      String s[] = "Xworkz is a training institute".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans = ans+ s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	    }
	}
}
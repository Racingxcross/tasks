package com.xworkz.tasks.thing;

public class DollarPyramid {
	  public static void main (String[] args) {
		  //i=no of rows
		  //k=j=no of column
		  
		  
		  int n=5;
		  //main loop
		  for(int i=1;i<=n;i++) {
			  //printing space
			  for(int j=n-1;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(int k=1;k<=i;k++) {
				  System.out.print("$ ");
			  }
			  System.out.println(" ");
		  }
	  }

	}



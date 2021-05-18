package com.ojas.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		 int studs[][] = new int[3][];
		 studs[0] = new int[3];
		 studs[1] = new int[2];
		 studs[2] = new int[1];
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter 3 marks ? ");
	      for(int i = 0;i < studs.length;i++)
	      {
	    	  System.out.println("Enter " + (i + 1) + "stud " + studs[i].length + " sub marks");

	    	  for(int j = 0;j < studs[i].length;j++)
	          {
	    		studs[i][j] = sc.nextInt();
	    	   }
	      }
	      
	      System.out.println("Student Info ? ");
	      for(int i = 0;i < studs.length;i++)
	      {
	    	 for(int j = 0;j < studs[i].length;j++)
	          {

                System.out.print(studs[i][j] + " ");
	    	   }
	    	 System.out.println();
	      }

	}

}

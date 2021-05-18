package com.ojas.arrays;

import java.util.Scanner;

public class ThreeDimensionalArrays {

	public static void main(String[] args) {

      int college[][][] = new int[2][2][4];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter College info ? ");
      for(int i = 0;i < college.length;i++)
      {
    	  for(int j = 0;j < college[i].length;j++)
          {
    		  System.out.println("Enter " + (i + 1) + "branch" + (j + 1) + "student "+ college[i][j].length + "sub marks");
    		  for(int k = 0;k < college[i][j].length;k++)
    	      {
    	    	 college[i][j][k] = sc.nextInt();
    	      }
    		  System.out.println();
          }
    	 
      }
      
      System.out.println("college info");
      for(int i = 0;i < college.length;i++)
      {
    	  for(int j = 0;i < college[i].length;j++)
          {
    		  for(int k = 0;k < college[i][j].length;k++)
    	      {
    	    	 college[i][j][k] = sc.nextInt();
    	      }
    		  System.out.println();
          }
    	 
      }
	}

}

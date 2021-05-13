package com.ojas.arrays;

import java.util.Scanner;

public class ArithematicOperationsForTwoDimensionalArrays {

	static int[][] sum(int a[][],int b[][]) {
		int c[][] = new int[3][3];
		 System.out.println("Sum of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++) {
			 for(int j = 0; j < 3; j++) { 
				 c[i][j]= a[i][j] + b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
	      } 
		return c;
	}
	static int[][] sub(int a[][],int b[][]) {
		int c[][] = new int[3][3];
		 System.out.println(" \n Subtraction of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++) {
			 for(int j = 0; j < 3; j++) { 
				 c[i][j]= a[i][j] - b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
	      } 
		return c;
	}
	static int[][] mul(int a[][],int b[][]) {
		int c[][] = new int[3][3];
		 System.out.println(" \n Multplication of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++) {
			 for(int j = 0; j < 3; j++) { 
				 c[i][j]= a[i][j] * b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
	      } 
		return c;
	}
	static int[][] div(int a[][],int b[][]) {
		int c[][] = new int[3][3];
		 System.out.println(" \n Division of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++) {
			 for(int j = 0; j < 3; j++) { 
				 c[i][j]= a[i][j] / b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
	      } 
		return c;
	}

	public static void main(String[] args) {

       int arr1[][] = {{1,2,7},{3,4,6},{2,8,1}};

       int arr2[][] = {{4,2,3},{6,4,1},{2,9,6}};
        
       sum(arr1, arr2);
       sub(arr1, arr2);
       mul(arr1, arr2);
       div(arr1, arr2);
     
	}

}


package com.ojas.arrays;

import java.util.Scanner;

public class AddingOfArrays {
	
	static int[] sum(int a[],int b[]) {
		int c[] = new int[5];
		 
		 for(int i = 0;i < 5;i++) {
	        c[i]= a[i] + b[i];
		 System.out.print(c[i] + " ");
		 } 
		return c;
	}

	public static void main(String[] args) {

       int a[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array1 values :");
		for(int i = 0; i < 5; i++) { 
          a[i] = sc.nextInt();
       }
       int b[] = new int[5];
       System.out.print("Enter the array2 values :");
        for(int i = 0; i < 5; i++) { 
         b[i] = sc.nextInt();
      }
       sum(a, b);
     
	}

}

package com.ojas.arrays;

import java.util.Scanner;

public class InsertAnElementInArray {

	public static void main(String[] args) {
		
		int n ,pos,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no .of elements :");
		n = sc.nextInt();
	    int[] array = new int[n + 1];
		System.out.print("Enter all the elements :");
		for(int i = 0; i < n ; i++) { 
           
            array[i] = sc.nextInt();
          }
		System.out.println(" \n Enter the position to insert an element ");
		 pos = sc.nextInt();
		System.out.println(" \n Enter the element you want to insert  ");
		 x = sc.nextInt();
		for(int i = (n-1);i >= (pos-1);i--)
		{
			array[i + 1] = array[i];
		}
		array[pos-1] = x;
		
		System.out.print("After Inserting the value :");
		for(int i = 0; i < n ; i++) { 
           
           System.out.print(array[i] + " ");
           }
		System.out.print(array[n]);
		
		




	}

}

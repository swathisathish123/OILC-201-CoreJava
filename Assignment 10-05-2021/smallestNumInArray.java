package com.ojas.arrays;

import java.util.Scanner;

public class smallestNumInArray {

	static void dispElementsInArray(int arr[]) {
		System.out.println("Array Elements as follows ?");
		for(int i=0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static int smallestValueInArray(int arr[]) {
		int min = arr[0] ;
		System.out.println("Smallest value In Array");
		for(int i=0;i < arr.length;i++)
		{

         if(min > arr[i])
         {
        	 min = arr[i];
         }
		}
		return min;
		}

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values ? ");
        int array[] = new int[10];
        for(int i=0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
		}

       dispElementsInArray(array);
       System.out.println(smallestValueInArray(array));
     

	}

}

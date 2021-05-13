package com.ojas.arrays;

import java.util.Scanner;

public class EvenNumsInArray {

	static void dispElementsInArray(int arr[]) {
		System.out.println("Array Elements as follows ?");
		for(int i=0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static String EvenNumsInArray(int arr[]) {
		String res = "";
		System.out.println("Even numbers In Array");
		for(int i=0;i < arr.length;i++)
		{
		 if(arr[i] % 2 == 0)
         {
        	 //System.out.println(arr[i]);
			 res += arr[i] + " ";
         }
		}
		return res;
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
       System.out.println(EvenNumsInArray(array));
     

	}


}

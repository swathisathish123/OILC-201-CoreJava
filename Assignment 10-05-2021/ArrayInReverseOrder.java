package com.ojas.arrays;

import java.util.Scanner;

public class ArrayInReverseOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values ? ");
        int array[] = new int[5];
        for(int i=0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
		}

       dispElementsInArray(array);
       NumsInReverseOrder(array);
     
	}

	static void dispElementsInArray(int arr[]) {
		System.out.println("Array Elements as follows ? \n");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	static void NumsInReverseOrder(int arr[]) {
       
		System.out.println(" \n Given numbers In reverse order \n ");
		
		for(int i = arr.length - 1;i >= 0;i--)
		{
			System.out.print(arr[i] + " ");
		}
		
		}
}

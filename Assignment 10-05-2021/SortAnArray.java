package com.ojas.arrays;

import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values ? ");
        int array[] = new int[5];
        for(int i=0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
		}

       dispElementsInArray(array);
       sortAnArray(array);
	}
	static void dispElementsInArray(int arr[]) {
		System.out.println("Array Elements as follows ? \n");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	static void sortAnArray(int arr[]) {

        System.out.print(" \n After Sorting the Array  \n ");
		
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		System.out.print(arr[i] + " ");
		}
}
	}


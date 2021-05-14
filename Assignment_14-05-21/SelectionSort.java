package com.ojas.arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the values ? ");

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		dispElementsInArray(array);

		sortAnArray(array);
	}

	static void dispElementsInArray(int arr[]) {

		System.out.println("Array Elements as follows ? \n");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void sortAnArray(int arr[]) {
		int size = arr.length;
		int temp;
		System.out.print("Sorting Array using Selection Sort Technique..\n");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}

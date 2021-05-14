package com.ojas.arrays;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {

		int i, n, search;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = sc.nextInt(); // no of elements
		int[] array = new int[n];

		System.out.println("Enter those " + n + " elements");

		for (i = 0; i < n; i++)
			array[i] = sc.nextInt();

		System.out.println("Enter value to find");
		search = sc.nextInt();

		for (i = 0; i < n; i++) {
			if (array[i] == search) /* Searching element is present */
			{
				System.out.println(search + " is present at location " + (i + 1) + ".");
				break;
			}
		}
		if (i == n) /* Element to search isn't present */
			System.out.println(search + " isn't present in array.");
	}

}

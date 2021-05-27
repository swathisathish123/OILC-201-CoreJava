package com.ojas.basic;

import java.util.Scanner;

public class DiagnolSumOfArray {

	static void printDiagonalSums(int[][] mat, int n) {
		int principal = 0, secondary = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

// Condition for principal
// diagonal
				if (i == j)
					principal += mat[i][j];

// Condition for secondary
// diagonal
				if ((i + j) == (n - 1)) {
					secondary += mat[i][j];
			}
		}

		System.out.println("Principal Diagonal:" + principal);

		System.out.println("Secondary Diagonal:" + secondary);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows/columns");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the array elements ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printDiagonalSums(arr, n);
	}

}
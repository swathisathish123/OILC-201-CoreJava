package com.ojas.basic;

import java.util.Scanner;

public class RowWiseSumInArray {

	private static int[] getRowSum(int[][] a) {
		int[] res = new int[3];

		int rows = 3, cols = 3;
		// Calculates sum of each row of given matrix
		for (int i = 0; i < rows; i++) {
			int k = 0;
			for (int j = 0; j < cols; j++) {
				res[k] += a[j][i];
				k++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of the 2D array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int[] sumarr = getRowSum(arr);
		for (int i = 0; i < 3; i++) {
			System.out.print(sumarr[i] + " ");
		}

	}
}

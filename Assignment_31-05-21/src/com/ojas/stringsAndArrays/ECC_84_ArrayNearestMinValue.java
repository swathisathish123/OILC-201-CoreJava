package com.ojas.stringsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ECC_84_ArrayNearestMinValue {

	public static int getNearestMinValue(int[] a) {
		/*int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0] - 1;*/
		Arrays.sort(a);
		return a[0] - 1;
	}

	public static void main(String[] args) {

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getNearestMinValue(arr));

	}

}

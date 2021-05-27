package com.ojas.basic;

import java.util.Scanner;

public class FindMinAndMaxInArray {

	static int findBiggestNum(int[] arr) {
		int max_no = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max_no) {
				max_no = arr[i];
			}
		}
		return max_no;
	}

	static int findSmallestNum(int[] arr) {
		int min_no = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min_no) {
				min_no = arr[i];
			}
		}
		return min_no;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Max_no in array : " + findBiggestNum(a));
		System.out.println(" Min_no in array : " + findSmallestNum(a));

	}

}

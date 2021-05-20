package com.ojas.arrays;

import java.util.Scanner;

public class ECC_38_FillMultiples {

	public static int[] getMultiplesArray(int number) {
		int[] res = new int[10];
		int j = 0;
		for (int i = 1; i <= res.length; i++) {
			res[j] = number * i;
			j++;
		}
        return res;
	}

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ? ");
		int n = sc.nextInt();
		int arr[] = getMultiplesArray(n);
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(n + "*" + j + "=" +arr[i]);
			j++;
		}

	}

}

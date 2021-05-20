package com.ojas.arrays;

import java.util.Scanner;

public class ECC_39_OccurrenceCounter {
	
	public static int getCount(int[] a, int search) {
		int res = 0; int flag = 0;
		
		if(a.length == 0) {
			res = -1;
		}else {
			for (int i = 0; i < a.length; i++) {
				if(search == a[i]) {
					flag++;
					res = flag;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		//int[] arr = { }; While giving elements statically,we don't have any elements in array then it prints the '-1'
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		 //While giving elements dynamically,it is not possible to print '-1'
		System.out.println("Enter the array elements ? ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the search element ?");
		int num = sc.nextInt();
		
		System.out.println(getCount(arr, num));
		
		
	}

}

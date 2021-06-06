package com.ojas.stringsAndArrays;

import java.util.Scanner;

public class ECC_85_EvenNumbersSumFromArray {

	public static int getSumOfEvenNumbers(int[] a) {
		int res = 0;
		if(a.length == 0) {
			res = -3;
		}
		else {
	    for(int i = 0;i < a.length;i++) {
	        if(a[i] < 0) {
	    		res = -1;
	    		break;
	    	}
	    	else if(a[i] == 0) {
	    		res = -2;
	    		break;
	    	}
	    	else {
	    		if(a[i] % 2 == 0) {
		    		res += a[i];
		    	}
	    	}
	    }
		}
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		 
		int[] arr = new int[size];
		for(int i = 0;i < size;i++) {
	    	arr[i] = sc.nextInt();
	    	}
		  System.out.println(getSumOfEvenNumbers(arr));
	}

}

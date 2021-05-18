package com.ojas.sortings;

import java.util.Scanner;

public class BinarySearchExample {
	
	 static Scanner sr = new Scanner(System.in);
	 static int[] sortElementst(int[] arr) {
	 System.out.println("Enter elements in array");
	 for (int i = 0; i < arr.length; i++) {
	 arr[i] = sr.nextInt();
	 } 
	 for (int i = 0; i < arr.length; i++) {
	 for (int j = i + 1; j < arr.length; j++) {
	 
	 if (arr[i] >= arr[j]) {
	 int temp = arr[i];
	 arr[i] = arr[j];
	 arr[j] = temp;
	 }
	 
	 }
	 
	 }
	 return arr;
	 }

public static void main(String[] args) {
	System.out.println("Enter elements in array");
	 int size = sr.nextInt();
	 
	 int arr[] = new int[size];
	 
	 arr = sortElementst(new int[arr.length]);
	 
	 System.out.println("After Sorting element in array: ");
	 for (int i = 0; i < size; i++) {
	 System.out.print(arr[i] + " ");
	 }
	 System.out.println("\n---------");
	 
	 System.out.println("Enter searching element in Array");
	 int search = sr.nextInt();
	 
	 int low = 0, high = size - 1, flag = 0, mid = 0;
	 while (low <= high) {
	 mid = (low + high) / 2;
	 if (arr[mid] == search) {
	 flag = 1;
	 break;
	 }
	 else if (arr[mid] < search) {
	 low = mid + 1;
	 }
	 else if (arr[mid] > search) {
	 high = mid - 1;
	 }
	 }
	 if(flag == 1)
	 System.out.println(search + " is found at " + mid);
	 else
	 System.out.println(search + " is found not found ");
	 }
}



package com.ojas.basic;

import java.util.Scanner;

public class CheckEvenNo {
	
	public static boolean isEven(int num) {
		boolean b = false;
		if(num % 2 == 0) {
			b = true;
		}
	   return b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		System.out.println("Given no is even : " + isEven(n));

	}

}

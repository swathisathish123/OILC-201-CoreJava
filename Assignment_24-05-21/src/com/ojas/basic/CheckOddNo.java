package com.ojas.basic;

import java.util.Scanner;

public class CheckOddNo {

	public static boolean isOdd(int num) {
		boolean b = false;
		if(num % 2 == 0) {
			b = false;
		}
		else {
			b = true;
		}
	   return b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		System.out.println("Given no is odd : " + isOdd(n));

	}


}

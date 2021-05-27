package com.ojas.basic;

import java.util.Scanner;

public class CheckPrimeNo {
	
	static boolean isPrime(int num) {
		boolean b = false;
		int i = 2, flag = 0;
		while (i < num) {
			if (num % i == 0) {
				flag++;
				break;
			}
			i++;
		}
		if (flag == 0) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		System.out.println("Given no is Prime number : " + isPrime(n));
	}

}

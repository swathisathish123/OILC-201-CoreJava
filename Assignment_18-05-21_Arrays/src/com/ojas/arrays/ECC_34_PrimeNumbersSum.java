package com.ojas.arrays;

import java.util.Scanner;

public class ECC_34_PrimeNumbersSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values ? ");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();
		System.out.println("Sum of the given Prime no's =" + " " + getPrimeNumbersSum(firstNum, secNum));
	}

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

	static int getPrimeNumbersSum(int n1, int n2) {
		int res = 0;
		if (n1 > 0 && n2 > 0) {
			for (int i = n1; i <= n2; i++) {
				if (isPrime(i)) {
					System.out.println(i + " ");
					res += i ;
				}
			}
		}
		return res;
	}

}

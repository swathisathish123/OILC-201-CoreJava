package com.ojas.basic;

import java.util.Scanner;

public class RangeOfPrimeNums {

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
	static int getPrimeNumbers(int n1, int n2) {
		int res = 0;
		if (n1 > 0 && n2 > 0) {
			for (int i = n1; i <= n2; i++) {
				if (isPrime(i)) {
					System.out.print( i + " ");
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First_Num  : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Sec_Num : ");
		int num2 = sc.nextInt();
		System.out.println("Range of Prime numbers are :");
		getPrimeNumbers(num1, num2);
	}
}

package com.ojas.arrays;

import java.util.Scanner;

public class ECC_33_ListPrimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values ? ");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();
		System.out.println(getPrimeNumbers(firstNum, secNum));
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

	static String getPrimeNumbers(int n1, int n2) {
		String res = "";
		if (n1 > 0 && n2 > 0) {
			if (n1 < n2) {
				for (int i = n1; i <= n2; i++) {
					if (isPrime(i)) {
						res += i + " ";
					}
				}
			} else if (n1 >= n2) {
				res = -2 + "";
			}
		}
          else {
			res = -1 + "";
		}
		return res;
	}

}

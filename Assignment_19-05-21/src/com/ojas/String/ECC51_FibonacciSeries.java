package com.ojas.String;

import java.util.Scanner;

public class ECC51_FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count : ");
		int turns = sc.nextInt();
		
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(turns - 2);// n-2 because 2 numbers are already printed
	}

	static int n1 = 0, n2 = 1, n3 = 0;

	static String printFibonacci(int count) {
		String res = "";
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			res += printFibonacci(count - 1);
		}
	   else{
			res += null;
		}
		return res;
	}

}

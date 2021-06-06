package com.ojas.stringsAndArrays;

import java.util.Scanner;

public class ECC_94_SumOfDigitsOfDecimalPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Double Number:");
		double num = sc.nextDouble();

		System.out.println(getSumOfDigits(num));
	}

	private static String getSumOfDigits(double num) {
		String number = Double.toString(num);
		String arr[] = number.split("[.]");
		int value = Integer.parseInt(arr[0]);
		int decvalue = Integer.parseInt(arr[1]);

		int valsum = sum(value);
		int decsum = sum(decvalue);

		return valsum + ":" + decsum;
	}

	private static int sum(int num) {
		int sum = 0;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			sum += temp;
			num = num / 10;
		}
		return sum;
	}

}

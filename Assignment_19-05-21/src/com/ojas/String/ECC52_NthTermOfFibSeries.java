package com.ojas.String;

import java.util.Scanner;

public class ECC52_NthTermOfFibSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth term : ");
		int nthTerm = sc.nextInt();
		System.out.println(getNthTermOfFibonacciSeries(nthTerm));
	}

	static int getNthTermOfFibonacciSeries(int n) {

		if (n <= 0) {
            return -1;
        }
 
        int previousFib = 0, currentFib = 1;
        for (int i = 0; i < n - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        }
 
        return currentFib;
    }

}

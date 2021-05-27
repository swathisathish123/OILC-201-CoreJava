package com.ojas.basic;

import java.util.Scanner;

public class PrintEvenNos {

	public static boolean isEven(int num) {
			boolean b = false;
			if(num % 2 == 0) {
				b = true;
			}
		   return b;
	}
	
	public static void printEvenNos(int n1,int n2 ) {
		for(int i = n1; i <= n2;i++) {
			if(isEven(i)) {
				System.out.print(i + " ");
			}
		}
	}	
  public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first_num number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Sec_num number : ");
			int num2 = sc.nextInt();
			printEvenNos(num1, num2);
		

		

	}

}

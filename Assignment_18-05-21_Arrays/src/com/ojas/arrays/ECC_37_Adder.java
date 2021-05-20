package com.ojas.arrays;

import java.util.Scanner;

public class ECC_37_Adder {
	
	public static String getSum(int n1,int n2) {
		String res = "";
		if(n1 <= 0 || n2 <= 0 ) {
			res = "Error";
		}else {
			res = (n1 + n2) + "";
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values ? ");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();
		System.out.println(getSum(firstNum, secNum));



	}

}

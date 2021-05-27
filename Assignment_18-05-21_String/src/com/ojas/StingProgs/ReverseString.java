package com.ojas.StingProgs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String str = sc.next();
		String res = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.print(res);
	}

}

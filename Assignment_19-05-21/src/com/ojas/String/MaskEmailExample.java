package com.ojas.String;

import java.util.Scanner;

public class MaskEmailExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String email = sc.next();
		email = email.toLowerCase();
		StringBuffer sb = new StringBuffer(email);
		for (int i = 2; i < sb.length() && (sb.charAt(i) != '@'); i++) {
			sb.setCharAt(i, 'X');
		}
		email = sb.toString();
		System.out.println(email);
	}

}

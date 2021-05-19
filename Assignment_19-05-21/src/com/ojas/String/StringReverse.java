package com.ojas.String;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string ?");
		String str = sc.next();
		// String str = "Welcome to Java";
		str = str.toLowerCase();
		String s[] = str.split(" ");
		System.out.println(str);

		String res = "";

		for (String x : s) {
			StringBuffer sb = new StringBuffer(x);
			x = sb.reverse().toString();
			res += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
		}

		System.out.println(res);

	}

}

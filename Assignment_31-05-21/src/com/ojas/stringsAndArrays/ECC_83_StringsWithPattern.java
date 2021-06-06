package com.ojas.stringsAndArrays;

import java.util.Scanner;

public class ECC_83_StringsWithPattern {

	public static String[] getWordsContainsPattern(String[] strArray, String str) {
		String[] res = new String[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].contains(str)) {
				res[i] = strArray[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();

		String[] words = new String[size];

		System.out.println("Enter array of strings ");
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();

		}
		System.out.println("Enter the pattern");
		String pattern = sc.next();

		String output[] = getWordsContainsPattern(words, pattern);
		for (int i = 0; i < words.length; i++) {
			if (output[i] != null) {
				System.out.println(output[i]);
			}
		}
	}
}

package com.ojas.String;

import java.util.Scanner;

public class PrintingVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string ?");
		String str = sc.next();
		str = str.toLowerCase();
		for(int i = 0;i < str.length();i++) {
		if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) 
		{
		char[] chararray =str.toCharArray();
		System.out.print( chararray[i] + " ");
		}
		}
	
	}

}

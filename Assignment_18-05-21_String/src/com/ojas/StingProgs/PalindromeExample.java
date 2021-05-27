package com.ojas.StingProgs;

import java.util.Scanner;

public class PalindromeExample {

	static String isPalindrame(String string) {
		String str = "";
		String res = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			res += string.charAt(i);
		}
		if(res.equals(string))
		{
			str = string + " is Palindrome";
		}
		else {
			str = string + " not a palindrome";
		}
		
		return str;
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String name = sc.next();
		System.out.println(isPalindrame(name));


	}

}

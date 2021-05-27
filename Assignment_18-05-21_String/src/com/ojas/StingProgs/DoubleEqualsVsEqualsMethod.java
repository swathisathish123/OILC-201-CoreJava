package com.ojas.StingProgs;

public class DoubleEqualsVsEqualsMethod {

	public static void main(String[] args) {

		// == Operator with Strings
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1 == str2) {
			System.out.println("both are same");
		}
		else {
			System.out.println("Both are not same");
		}
		
		if(str1.equals(str2)) {
			System.out.println("both are same");
		}
		else {
			System.out.println("Both are not same");
		}
			
			
		System.out.println("------------------------");
		
		// equals() with Strings
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str3 == str4) {
			System.out.println("both are same");
		}
		else {
			System.out.println("Both are not same");
		}
		
		if(str3.equals(str4)) {
			System.out.println("both are same");
		}
		else {
			System.out.println("Both are not same");
		}

		

	}

}

package com.ojas.arrays;

import java.util.Scanner;

public class ECC_35_StringWeaver {
  public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ? ");
		String firstString = sc.next();
		System.out.println("Enter second String ? ");
		String secString = sc.next();
		System.out.println(getWeavedString(firstString, secString));

	}

	public static String getWeavedString(String s1, String s2) {
		String res ="";
		if(s1.length() == 0 || s2.length() == 0) {
			res += "-1";
		}else {
			
			if(s1.length() > s2.length()) {
				res += s1 + s2 + s1;
				return res;
			}
			else if(s1.length() < s2.length()) {
				res += s2 + s1 + s2;
				return res;
			}
			else if(s1.length() == s2.length()) {
				
				for(int i = 0;i < s1.length();i++) {
					res += s1.charAt(i) + "" + s2.charAt(i);
				}
				return res;
			}
		}
		return res;
	}
 }

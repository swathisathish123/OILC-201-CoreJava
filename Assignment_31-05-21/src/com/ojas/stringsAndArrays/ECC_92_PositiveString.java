package com.ojas.stringsAndArrays;
import java.util.*;

public class ECC_92_PositiveString {
	
	static boolean isPositiveString(String str) {
			boolean flag = true;
			str = str.toUpperCase();
			char ascii1 = str.charAt(0);
			
			for(int i = 1; i < str.length(); i++) {
				char ascii2 = str.charAt(i);
				
				if(ascii1 > ascii2) {
					flag = false;
					break;
				}
				ascii1 = ascii2;
			}
			
			return flag;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any String: ");
			String str = sc.next();
			
			System.out.println(isPositiveString(str));

		}

	}



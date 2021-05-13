package com.ojas.methods;

import java.util.Scanner;

public class ECC_15_BooleanValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three boolean values");
		
		System.out.println(countBoolean(sc.nextBoolean(), sc.nextBoolean(), sc.nextBoolean()));

	}
	
	static boolean countBoolean(boolean val1, boolean val2, boolean val3) {
		int count = 0;
		
		if(val1) {  //if loop always takes true only so if value1 is true then only increment the count
			count++;
		}
		if(val2) {
			count++;
		}
		if(val3) {
			count++;
		}
		
		if(count >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
}

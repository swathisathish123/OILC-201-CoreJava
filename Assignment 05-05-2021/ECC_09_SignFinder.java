package com.ojas.methods;

import java.util.Scanner;

public class ECC_09_SignFinder {

	static int findSign(int givenNum)
	{
		int result = 0;
		if(givenNum > 0)
		{
			result = 1;
		}
		else if(givenNum < 0)
		{
			result = -1;
		}
		else {
			result = 0;
		}
		return result;
   }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number ?");
	    try {
	    	int num= sc.nextInt();
		    System.out.println(findSign(num));
		} catch (Exception e) {
			System.out.println("Enter only numeric values");
		}
	    
	}
	}

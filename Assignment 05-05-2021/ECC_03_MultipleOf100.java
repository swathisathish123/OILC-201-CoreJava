package com.ojas.methods;

import java.util.Scanner;

public class ECC_03_MultipleOf100 {
	
	
	static int getNextMultipleOf100(int givenNum)
	{
		if(givenNum >= 100)
		{
			int  quotient = givenNum/100;
			quotient = quotient + 1;
			int result = quotient * 100;
			return result;
		}
		else
		{
			return -1;
		}
	}
	
	
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number");
		try {
		int num = sc.nextInt();
		System.out.println(getNextMultipleOf100(num));
		}
		catch (Exception e) { //If we take string then we got InputMis
			System.out.println("Enter only numeric values..");
		}
    
	}

}

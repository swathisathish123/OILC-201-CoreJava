package com.ojas.methods;

import java.util.Scanner;

public class ECC_02_DigitChecker {

	static int getDiffOfDigits(int given_num)
	{
		if(given_num >= 10 && given_num <= 99)
		{
			 int reminder = given_num % 10; //units position of given no
			 int quotient = given_num / 10; //tens position of given no
             int result = quotient - reminder;
             return result;
        }
		else if(given_num < 0)
		{
			return -3;
		}
		else if(given_num > 99)
		{
			return -2;
		}
		else 
		{
			return -1;
		}
    }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any number ? ");
		 int num = sc.nextInt();
		 System.out.println("Difference of digits of given number : " + getDiffOfDigits(num));
	}
}
	

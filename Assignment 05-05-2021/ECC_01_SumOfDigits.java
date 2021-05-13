package com.ojas.methods;

import java.util.Scanner;

public class ECC_01_SumOfDigits {
	
	static int getSumOfDigits(int given_num)
	{
		if(given_num >= 10 && given_num <= 99)
		{
			 int reminder = given_num % 10;
			 int quotient = given_num / 10;
             int result = reminder + quotient;
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
    System.out.println("Sum of digits of given number : " + getSumOfDigits(num));

	}

}

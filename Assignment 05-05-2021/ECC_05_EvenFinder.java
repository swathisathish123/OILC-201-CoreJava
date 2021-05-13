package com.ojas.methods;

import java.util.Scanner;

public class ECC_05_EvenFinder {
	
   static int isEven(int givenNum)
	{
		int result = 0 ;
		if(givenNum > 0)
		{
		if(givenNum % 2 == 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		}
		else
		{
			result = -1;
		}
		return result;
		
	}

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter any number");
		    int num = sc.nextInt();
		    System.out.println(isEven(num));


	}

}

package com.ojas.methods;

import java.util.Scanner;

public class ECC_08_OddRounder {
	
	static int oddRounder(int givenNum)
	{
		int result =0;
		if(givenNum % 2 != 0)
		{
			    int  quotient = givenNum/10;
				quotient = quotient + 1;
				result = quotient * 10;
		}
		else
		{
			result = givenNum;
		}
		return result;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number ?");
	    int num= sc.nextInt();
	    System.out.println(oddRounder(num));
	}

}

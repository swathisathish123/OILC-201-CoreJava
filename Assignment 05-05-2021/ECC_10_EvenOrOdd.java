package com.ojas.methods;

import java.util.Scanner;

public class ECC_10_EvenOrOdd {

	static String isEvenOrOdd(int givenNum)
	{
		String result = null;
		if(givenNum <= 0)
		{
			result = "Invalid Output";
		}
		else if(givenNum % 2 == 0){
			result = "Even";
		}
		else {
			result = "Odd";
		}
      return result;
   }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number ?");
	    try {
	    	int num= sc.nextInt();
		    System.out.println(isEvenOrOdd(num));
		} catch (Exception e) {
			System.out.println("Enter only numeric values");
		}
	    
	}

}

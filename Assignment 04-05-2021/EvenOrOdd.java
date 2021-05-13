package com.ojas.switchPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

      Scanner sc =new Scanner(System.in);
      System.out.println("Enter Any Number ? ");
      try
      {
      int num = sc.nextInt(); //If end user enter String value then we got "InputMismatchException"
      String res = "";        //hence we need to handle that exception.For this reason we take try&catch block.
      
      switch (num%2) {
	   case 0: {
		   res = num + " is Even Number";
		}
	   case 1: {
		   res = num + " is Odd Number";
		}
      }
	 
      System.out.println(res);
    }
     catch (InputMismatchException e) {

         System.out.println("Enter only numeric values");
	}
	}
}

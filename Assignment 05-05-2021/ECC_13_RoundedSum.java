package com.ojas.methods;

import java.util.Scanner;

public class ECC_13_RoundedSum {
	
	 public static int sumOfRoundedValues(int a, int b, int c) {
        int result1 = 0;
	  if(a > 0 && b > 0 && c > 0)
         {
            result1 = roundedValue(a) + roundedValue(b) + roundedValue(c);
         }
         else {
      	   result1 = -1;
         }
         return result1;

	    }
	 static int roundedValue(int num)
	 {
		 int result = 0;int total =0;
		 if(num%10 < 5)
    	   {
    		 int  quotient = num/10;
    		         total = quotient * 10;
			       result += total;
   		   }
    	   else {
    		   int  quotient = num/10;
      			    quotient = quotient + 1;
      			       total = quotient * 10;
      			     result += total;
    	   }
		return result;
	 }

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter three numbers ? ");
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int n3 = sc.nextInt();
		    System.out.println("Sum of rounded values of given numbers : " + sumOfRoundedValues(n1, n2, n3));

    }

}

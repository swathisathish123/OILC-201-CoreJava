package com.ojas.methods;

import java.util.Scanner;

 public class ECC_11_Rounder {
	 static int calculate(int givenNum){
		 int result = 0 ;
		  
		  if(givenNum > 0) { //outer if loop opening
		   if(givenNum % 2 == 0) //inner if loop opening
			  {
				result = givenNum * givenNum;
			  }//inner if loop closing
			else{
				result = givenNum * givenNum * givenNum;
			}
		   } //outer if loop closing
			else {
				result = -1;
			  }
	     return result;
	 	
     }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number ?");
	    try {
	    	int num= sc.nextInt();
		    System.out.println(calculate(num));
		} catch (Exception e) {
			System.out.println("Enter only numeric values");
		}
	}



}

package com.ojas.basicprograms;

import java.util.Scanner;

public class Adder {
	
	public static void getSum(int num1, int num2) {
		
		int c = num1 + num2;
	   System.out.println(c);
	}

public static void main(String[] args) {

	Scanner sca=new Scanner(System.in) ;
	
	System.out.println("Enter the first interger value");
	int a=sca.nextInt();
	
	System.out.println("Enter the second interger value");
	int b=sca.nextInt();
	
    getSum(a, b);
       
	 
		
	}

}

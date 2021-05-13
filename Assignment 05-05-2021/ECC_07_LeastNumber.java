package com.ojas.methods;

import java.util.Scanner;

public class ECC_07_LeastNumber {

	static int getLeastNum(int n1,int n2){
		int result = 0;
		if(n1 > 0 && n2 > 0)
		{
			if(n1 < n2)
			{
             result = n1;
			}
			else{
				result = n2;
			}
		}
		else if(n1 < 0 || n2 < 0){
			result = -1;
		}
		else {
			result = -2;
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter two numbers ?");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    System.out.println("Smallest Num is " +getLeastNum(num1, num2));

	}
}

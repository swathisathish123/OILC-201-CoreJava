package com.ojas.methods;

import java.util.Scanner;

public class ECC_04_Palindrome {

	static int isPalindrome(int given_num)
	{
		int originalNum = given_num, r ,revNum = 0;int result = 0;
		//originalNum is temp variable
		if(given_num >= 99 && given_num <= 999 )
		{
			while(given_num > 0) {
			r = given_num % 10;
			revNum = revNum * 10 + r;
			given_num = given_num/ 10;
		}
		if(revNum == originalNum)
			result = 1;
		else
			result = 0;
		}
		else if(given_num <=0)
		{
			result = -1;
		}
		else 
		{
			result = -2;
		}
		return result;
  }

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 3 digit number");
    int num = sc.nextInt();
    System.out.println(isPalindrome(num));

	}

}

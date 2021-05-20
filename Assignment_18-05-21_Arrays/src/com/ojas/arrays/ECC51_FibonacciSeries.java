package com.ojas.arrays;

import java.util.Scanner;

public class ECC51_FibonacciSeries {

	/*public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count : ");
		int turns = sc.nextInt();
		
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(turns - 2);// n-2 because 2 numbers are already printed
	}

	static int n1 = 0, n2 = 1, n3 = 0;

	static String printFibonacci(int count) {
		String res = "";
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			res += printFibonacci(count - 1);
		}
	   else{
			res += null;
		}
		return res;
	}
*/
	static String output="";
		
		static String getPolindromeList(int num) {
			int x, r, rev=0, sum;
			x=num;
			output = output + x ;
			
			while(num > 0) {
				r = num % 10;
				rev = rev * 10 + r;
				num = num / 10;
			}
			
			if(rev == x) {
				return output;
			}
			
			output = output + "," + rev + ",";
			sum = x + rev;
			
			return getPolindromeList(sum);
		}
		
		static boolean check(int num) {
			
			if((num < 100) || (num >= 1000)) {
				System.out.println("Error");
				return false;
			}
			else {
				return true;
			}
					
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Number");
			int num = sc.nextInt();
			
			if(check(num)) {
				System.out.println(getPolindromeList(num));
			}
		}

}

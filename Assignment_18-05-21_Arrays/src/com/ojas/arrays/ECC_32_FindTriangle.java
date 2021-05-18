package com.ojas.arrays;

import java.util.Scanner;

public class ECC_32_FindTriangle {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the triangle sides ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    System.out.println(findTriangle(a, b, c));

		}
	
	static String findTriangle(int side1,int side2,int side3){
		String res = "";
		if(side1 > 0 && side2 > 0 && side3 > 0) {
			
		 if((side1 >= (side2 + side3)) || (side2 >= (side1 + side3)) || (side3 >= (side2 + side3))) {
				res += -3 + "";
			}
		 else if((side1==side2 && side1==side3)) 
			{
				
				res += "EQUILATERAL";
			}
			else if((side1 == side2 || side1 == side3) || (side2 == side1 || side2 == side3) || (side3 == side1 || side3 == side2)) {
				res += "ISOSCELES";
			}
			else {
				res +=  "SCALENE";
			}	
		}
		
		else if((side1 < 0) || (side2 < 0) || (side3 < 0)) {
			res += -2 + "";
		}
		else {
			res += -1 + "";
		}
		return res;
	}
  }

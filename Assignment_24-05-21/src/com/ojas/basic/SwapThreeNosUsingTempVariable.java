package com.ojas.basic;

import java.util.Scanner;

public class SwapThreeNosUsingTempVariable {

	static int a, b, c;
	
	// Assign c's value to a, a's value
    // to b and b's value to c.
 
    static void swapThree()
    {
    	int temp = 0;
    	
    	  temp = a;
          
          a = b;
         
          b = c;
         
          c = temp;

    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First_Num  : ");
		int a = sc.nextInt();
		System.out.println("Enter Sec_Num : ");
		int b = sc.nextInt();
		System.out.println("Enter Third_Num : ");
		int c = sc.nextInt();
		
        System.out.println("Before swapping a = " + a + ", b = " + b + ", c = " + c);
                             
        swapThree();
 
        System.out.println("After swapping a = " + a + ", b = " + b + ", c = " + c);
    }
	}



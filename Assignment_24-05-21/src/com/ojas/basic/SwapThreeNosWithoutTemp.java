package com.ojas.basic;

import java.util.Scanner;

public class SwapThreeNosWithoutTemp {

	 static int a, b, c;
	 
	    // Assign c's value to a, a's value
	    // to b and b's value to c.
	 
	    static void swapThree()
	    {
	        a = a + b + c; // a = 60
	     
	        
	        b = a - (b + c); // b = 60-50 =10
	     
	        
	        c = a - (b + c); // c =60 -40 = 20
	     
	        
	        a = a - (b + c);// a =60-30 =30
	    }
	 
	    
	    public static void main(String []args)
	    {
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

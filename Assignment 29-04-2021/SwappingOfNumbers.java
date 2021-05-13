package com.ojas.basicPrograms;

import java.util.Scanner;

public class SwappingOfNumbers {

   public static void main(String[] args) {

//case(i) : Swap the two numbers using temp variable
		
	   int a,b,temp;
	   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = sc.nextInt();  
       b = sc.nextInt();  
	  
       System.out.println("Before Swap the numbers : " + a + " " + b);
		
	     temp = a;
	        a = b;
	        b = temp;
	        
	   System.out.println("After Swap the numbers : " + a + " " + b);
	   
	   System.out.println("===================");

//case(ii) : Swap the two numbers without using temp variable
	   
           int x , y ;
	   
       Scanner sca = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sca.nextInt();  
       y = sca.nextInt();  
	  
       System.out.println("Before Swap the numbers : " + x + " " + y);
		
	      /*y = x + y;   
	        x = y - x;
	        y = y - x;*/
       
            x = x + y;   
            y = x - y;
            y = y - x;
	        
	   System.out.println("After Swap the numbers : " + x + " " + y);

	}

}

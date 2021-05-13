package com.ojas.basicprograms;

public class Factorial {
	
  static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
	}
	public static void main(String[] args) {
	
/*//Factorial Program using loop
		
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
	  System.out.println("Factorial of "+number+" is: "+fact); 
	    
*/
		
//Factorial Program using recursion
		
		 int i,fact=1;  
		  int number=4;//It is the number to calculate factorial    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    	
}

}

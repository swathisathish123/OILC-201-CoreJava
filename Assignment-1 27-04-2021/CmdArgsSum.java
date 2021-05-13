package com.ojas.cmdPrograms;

public class CmdArgsSum {

	public static void main(String[] args) {
//Case(1):
 /*      System.out.println("Four Cmd Args are : " + args[0] + args[1] + args[2] + args[3]);
       
       int a = Integer.parseInt(args[0])+Integer.parseInt( args[1]);
       int b = Integer.parseInt(args[2]) +Integer.parseInt( args[3]);
       
       System.out.println("The Sum is : " + (a+b));
	}
*/
//Case(2):sum of two variables
		int sum=0;
		for (int i = 0;i < args.length;i++) {
			 sum = sum +Integer.parseInt(args[i]);
		}
	    System.out.println(sum);
		
}
}
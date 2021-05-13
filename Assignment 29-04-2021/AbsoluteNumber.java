package com.ojas.basicPrograms;

public class AbsoluteNumber {

	public static void main(String[] args) {

		 int number = Integer.parseInt(args[0]);
	        int sum = 0;
	        if(number > 0)
	        {
	            System.out.println("The Absolute value of "+ number +" is " + number);
	        }
	        else if(number <= 0)
	        {
	            sum = 0 - number;
	            System.out.println("The Absolute value of "+ number +" is  " + sum);
	        }   

	}

}

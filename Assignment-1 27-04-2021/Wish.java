package com.ojas.cmdPrograms;

public class Wish {

	public static void main(String[] args) {

		   if(args[0].equalsIgnoreCase("AM"))
	          System.out.println( "GoodMorning" + " " + args[1]);
			
			else if(args[0].equalsIgnoreCase("PM") )
		          System.out.println( "GoodEvening"+ " " + args[1]);
			else
				System.out.println("First arg should be either AM or PM");
 }

}


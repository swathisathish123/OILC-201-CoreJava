package com.ojas.switchPrograms;

import java.util.Scanner;

public class ArithematicOperationsUsingMenuDrivenApp {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		while (true) { //while opening,it is used to iterate the loop infinity times
         String menu = "Menu Driven Application \n";
         menu += " 1.Addition \n";
         menu += " 2.Subtraction \n";
         menu += " 3.Division \n";
         menu += " 4.Multiplication \n";
         menu += " 5.Exit \n";
         menu += " Select any Option ? \n";
         System.out.println(menu);
         String res = "";
         int choice = sc.nextInt();
         switch(choice)
         {
         case 1:
        	 System.out.println("Enter two numbers");
        	 res = "SUM = " + (sc.nextInt() + sc.nextInt());
        	 break;
         case 2:
        	 System.out.println("Enter two numbers");
        	 res = "SUB = " + (sc.nextInt() - sc.nextInt());
        	 break;
         case 3:
        	 System.out.println("Enter two numbers");
        	 res = "DIV = " + (sc.nextInt() / sc.nextInt());
        	 break;
         case 4:
        	 System.out.println("Enter two numbers");
        	 res = "MUL = " + (sc.nextInt() * sc.nextInt());
        	 break;
         case 5:
        	 System.exit(0);
        	 break;
        default:
        	res = "Invalid Option";
         }
         System.out.println(res);
         
	 } //while closing

	}

}

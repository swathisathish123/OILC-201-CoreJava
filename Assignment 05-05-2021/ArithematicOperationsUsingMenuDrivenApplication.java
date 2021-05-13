package com.ojas.methods;

import java.util.Scanner;

public class ArithematicOperationsUsingMenuDrivenApplication {
	
	static void menuDisplay()
	{
		String menu = "Menu Driven Application \n";
        menu += " 1.Addition \n";
        menu += " 2.Subtraction \n";
        menu += " 3.Division \n";
        menu += " 4.Multiplication \n";
        menu += " 5.Exit \n";
        menu += " Select any Option ? \n";
        System.out.println(menu);
	}
	static int sum(int firstNum,int secNum)
	{
		return firstNum + secNum;
	}
	static int sub(int firstNum,int secNum)
	{
		return firstNum - secNum;
	}
	static int div(int firstNum,int secNum)
	{
		return firstNum / secNum;
	}
	static int mul(int firstNum,int secNum)
	{
		return firstNum * secNum;
	}
   static  void accept()
   {
	   System.out.println("Enter two numbers");
   }
   
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		while(true) { //while opening
			menuDisplay();
		int choice = sc.nextInt();
		String res = "";
		switch(choice)
        {
        case 1:
       	accept();
       	 res = "SUM = " + sum(sc.nextInt(),sc.nextInt());
       	 break;
        case 2:
       	 accept();
       	 res = "SUB = " + sub(sc.nextInt(),sc.nextInt());
       	 break;
        case 3:
        accept();
       	 res = "DIV = " + div(sc.nextInt(), sc.nextInt());
       	 break;
        case 4:
        accept();
       	 res = "MUL = " + mul(sc.nextInt(),sc.nextInt());
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


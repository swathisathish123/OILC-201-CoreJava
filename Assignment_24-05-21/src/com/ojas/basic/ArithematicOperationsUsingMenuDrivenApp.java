package com.ojas.basic;

import java.util.Scanner;

public class ArithematicOperationsUsingMenuDrivenApp {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc =new Scanner(System.in); while (true) { //while opening,it is used
	 * to iterate the loop infinity times String menu =
	 * "Menu Driven Application \n"; menu += " 1.Addition \n"; menu +=
	 * " 2.Subtraction \n"; menu += " 3.Division \n"; menu +=
	 * " 4.Multiplication \n"; menu += " 5.Exit \n"; menu +=
	 * " Select any Option ? \n"; System.out.println(menu); String res = ""; int
	 * choice = sc.nextInt(); switch(choice) { case 1:
	 * System.out.println("Enter two numbers"); res = "SUM = " + (sc.nextInt() +
	 * sc.nextInt()); break; case 2: System.out.println("Enter two numbers"); res =
	 * "SUB = " + (sc.nextInt() - sc.nextInt()); break; case 3:
	 * System.out.println("Enter two numbers"); res = "DIV = " + (sc.nextInt() /
	 * sc.nextInt()); break; case 4: System.out.println("Enter two numbers"); res =
	 * "MUL = " + (sc.nextInt() * sc.nextInt()); break; case 5: System.exit(0);
	 * break; default: res = "Invalid Option"; } System.out.println(res);
	 * 
	 * } //while closing }
	 */
	int result = 0;

	int add(int fno, int sno) {
		result = fno + sno;
		return result;
	}

	int sub(int fno, int sno) {
		result = fno - sno;
		return result;
	}

	int mul(int fno, int sno) {
		result = fno * sno;
		return result;
	}

	public static void main(String[] args) {
		
		ArithematicOperationsUsingMenuDrivenApp demo = new ArithematicOperationsUsingMenuDrivenApp();
		int fno = 0;
		int sno = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("```````````````````````````````````````````````");
			System.out.println("                 1)ADD                         ");
			System.out.println("                 2)SUB                         ");
			System.out.println("                 3)MUL                        ");
			System.out.println("                 4)Exit                         ");

			System.out.println("```````````````````````````````````````````````");
			System.out.println("Enter The Choice ? ");
			int choice = sc.nextInt();
			
			switch (choice) {

			case 1:
				System.out.println("Enter First Number :");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();
				result = demo.add(fno, sno);
				System.out.println("Addion of Two Numbers :" + result);
				break;
			case 2:
				System.out.println("Enter First Number :");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();
				result = demo.sub(fno, sno);
				System.out.println("SubTraction of two Numbers :" + result);
				break;
			case 3:
				System.out.println("Enter First Number :");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();
				result = demo.mul(fno, sno);
				System.out.println("Multiplication of Two Numbers :" + result);
				break;
			case 4:
				System.out.println("Thx For Using App!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 4 Between");
			}// end of switch

		} // end of while
	}

}

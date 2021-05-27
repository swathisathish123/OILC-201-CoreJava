package com.ojas.basic;

import java.util.Scanner;

public class TiffinCenterUsingMenuDrivenApp {

	static int idly_bill = 0, dosa_bill = 0, puri_bill = 0, bonda_bill = 0;
	static int total_bill = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println(menu());
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How Many Plates Do you Want");
				System.out.println(idly(s.nextInt()));
				break;
			case 2:
				System.out.println("How Many Plates Do you Want");
				System.out.println(dosa(s.nextInt()));
				break;
			case 3:
				System.out.println("How Many Plates Do you Want");
				System.out.println(bonda(s.nextInt()));
				break;
			case 4:
				System.out.println("How Many Plates Do you Want");
				System.out.println(puri(s.nextInt()));
				break;
			case 5:
				System.out.println(bill());
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}

	private static String bill() {
		total_bill = idly_bill + dosa_bill + puri_bill + bonda_bill;
		return "Final Amount:" + total_bill;
	}

	static String puri(int plates) {
		int puri_price = 30;
		puri_bill = plates * puri_price;
		return plates + " Plates Puri Bill :" + puri_bill;
	}

	static String bonda(int plates) {
		int bonda_price = 30;
		bonda_bill = plates * bonda_price;
		return plates + " Plates Bonda Bill :" + bonda_bill;
	}

	static String dosa(int plates) {
		int dosa_price = 45;
		dosa_bill = plates * dosa_price;
		return plates + " Plates Dosa Bill :" + dosa_bill;
	}

	static String idly(int plates) {
		int idli_price = 20;
		idly_bill = plates * idli_price;
		return plates + " Plates Idly Bill :" + idly_bill;
	}

	static String menu() {
		String menu = "Select Any Item You Want:\n";
		menu += "1.Idly\n";
		menu += "2.Dosa\n";
		menu += "3.Bonda\n";
		menu += "4.Puri\n";
		menu += "5.Bill\n";
		menu += "6.exit\n";

		return menu;
	}

}
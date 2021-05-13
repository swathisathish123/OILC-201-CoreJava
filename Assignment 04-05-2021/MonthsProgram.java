package com.ojas.switchPrograms;

import java.util.Scanner;

public class MonthsProgram {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Month Name With 3 Characters ? ");
	    String monthName=sc.next().toUpperCase();
	     
	    String res = "";
	    switch (monthName) {
		case "JAN":
		case "MAR":
		case "MAY":
		case "JUL":
		case "AUG":
		case "OCT":
		case "DEC":
			res = monthName + " has 31 days only";
			break;
			
		case "APR":
		case "JUN":
		case "SEP":
		case "NOV":
			res = monthName + " has 30 days only";
			break;
			
		case "FEB":
			res = monthName + " has 28 days only";
			break;

		default:
			 res = " Invalid Month Name";
		}
	    System.out.println(res);

	}

}

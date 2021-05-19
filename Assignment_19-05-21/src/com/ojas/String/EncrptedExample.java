package com.ojas.String;

import java.util.Scanner;

public class EncrptedExample {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str = sc.next();
	        str = str.toLowerCase();
	        String res = "";
	        for(int i = 0 ; i < str.length() ; i++)
	        {
	             int index = 'z' - str.charAt(i);
	             res += (char)('a'+ index);
	        }
	        System.out.println(res);
	       
	    }

	}



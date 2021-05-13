package com.ojas.switchPrograms;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Any Character ? ");
	    
	    char chr=sc.next().toUpperCase().charAt(0);
	    if(Character.isLetter(chr)){
	    	boolean b = false;
	    	
	    	switch (chr) {
			case 'A': 
			case 'E': 
			case 'I': 
			case 'O': 
			case 'U': 
				b = true;
				break;
			}
	    	String res = "";
	    	if(b) {
	    		res = chr + " is Vowel";
	    	}
	    	else {
	    		res = chr + " is Consonent";
	    	}
	    	System.out.println(res);	
	    }
	    else{
	    	System.out.println(" Not a valid character");
	    }

	}

}

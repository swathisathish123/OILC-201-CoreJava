package com.ojas.stringsAndArrays;
import java.util.Scanner;

public class ECC_96_MaskEmailID {
	
		static boolean b = false;
		
		static String maskMailId(String email) {
			ECC_95_ValidateEmailID em = new ECC_95_ValidateEmailID();
			String res = "";
			String str = em.isValidEmail(email);
			StringBuffer sb = new StringBuffer(email);
			
			if(str.equals("Valid")) {
				b = true;
				for(int i = 1; email.charAt(i) != '@'; i++) {
					sb.setCharAt(i, '*');
				}
				res = sb.toString();
			}
			else {
				res = "Invalid";
			}
			
			return res;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter email Id");
			String maskMail = maskMailId(sc.next());
			if(b) {
				System.out.println("Masked emailId is: \n" + maskMail);
			}
			else {
				System.out.println(maskMail);
			}

		}

	}

	


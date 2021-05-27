package com.ojas.StingProgs;

public class EqualsMethodExample {

	public static void main(String[] args) {

     String str1 = "Java";
     String str2 = "Java";
     System.out.println(str1.equals(str2));//true
     
     String str3 = "Java";
     String str4 = "java";
     System.out.println(str3.equals(str4));//false
     
     String str5 = "Java";
     String str6 = "java";
     System.out.println(str5.equalsIgnoreCase(str6));//true
     

	}

}

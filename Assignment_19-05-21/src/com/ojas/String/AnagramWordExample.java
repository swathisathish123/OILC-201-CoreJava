package com.ojas.String;

import java.util.*;

public class AnagramWordExample {
	
	static void isAnagram(String s1, String s2) {  
       
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings ?");
		String str1 = sc.next();
		String str2 = sc.next();
		isAnagram(str1, str2);

}

}

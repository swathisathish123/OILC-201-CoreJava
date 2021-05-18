package com.ojas.StingProgs;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		//Once the String obj is created for "Hello",it can't be changed and
		//it again new obj is created for "HelloWelcome".Hence String Class is Immutable.so it returns diff addresses
		
		String str = "Hello"; 
		System.out.println("Before" + " " + str + " " + str.hashCode());
		str += "Welcome";
		System.out.println("After" + " " + str + " " + str.hashCode());

		StringBuffer sb = new StringBuffer("Hello");//StringBuffer is mutable
		System.out.println("Before" + " " + sb + " " + sb.hashCode());
		sb.append("Welcome");
		System.out.println("After" + " " + sb + " " + sb.hashCode());

	}

}

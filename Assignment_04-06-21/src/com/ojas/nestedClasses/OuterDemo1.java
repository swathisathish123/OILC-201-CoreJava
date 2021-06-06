package com.ojas.nestedClasses;

public class OuterDemo1 {

	static class InnerDemo1{
		static void disp() {
			System.out.println("Welcome");
		}
	}
	public static void main(String[] args) {
		OuterDemo1.InnerDemo1.disp();

	}

}

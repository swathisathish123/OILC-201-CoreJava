package com.ojas.nestedClasses;

public class OuterDemo2 {

	void disp() {
		System.out.println("Welcome");
		class InnerDemo2{
			void wish() {
				System.out.println("hi.......");
			}
		}
		InnerDemo2 obj1 = new InnerDemo2();
		obj1.wish();
	}
	public static void main(String[] args) {
		OuterDemo2 obj = new OuterDemo2();
		obj.disp();
		

	}

}

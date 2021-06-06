package com.ojas.multilevelInheritance;

class  A{
	A(){
		System.out.println("A class constructor is invoked");
	}
}
class B extends A{
	B(){
		System.out.println("B class constructor is invoked");
	}
}
public class C extends B {
	C(){
		System.out.println("C class constructor is invoked");
	}

	public static void main(String[] args) {
		C obj = new C();
	}

}

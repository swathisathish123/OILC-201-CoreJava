package com.ojas.Polymorphism;

public class Demo {
	static void sum() {
		System.out.println("welcome");
	}
	final void sum(int a,int b) {
		System.out.println("sum = " + (a + b));
	}
	private double sum(double a,double b,double c) {
		return a + b + c;
	}
	String sum(String s1,String s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.sum();
		obj.sum(5, 10);
		System.out.println("Sum of double = " + obj.sum(10.00, 20.00, 30.00));
		System.out.println("Sum of Strings = " + obj.sum("Hello", "World"));

	}

}

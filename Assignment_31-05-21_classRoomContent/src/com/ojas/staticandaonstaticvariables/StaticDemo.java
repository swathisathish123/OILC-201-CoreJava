package com.ojas.staticandaonstaticvariables;

public class StaticDemo {

	static int firstNum = 10;
	static int secNum = 20;
	
	void sum() {
		System.out.println("SUM = " + (firstNum + secNum));
	}
	
	static void product() {
		System.out.println("PRODUCT = " + (firstNum * secNum));
	}
	public static void main(String[] args) {
		
		StaticDemo.product();
		product();
	
		
		StaticDemo obj = new StaticDemo();
		obj.product();
		obj.sum();
		
	}
}

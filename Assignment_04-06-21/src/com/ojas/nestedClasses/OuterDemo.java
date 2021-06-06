package com.ojas.nestedClasses;

public class OuterDemo {

	int num1 = 10;
	class InnerDemo{
		int num2 = 20;
		InnerDemo(){
		System.out.println("num1 = " + num1 + "num2 =" + num2);
		}
	}
	OuterDemo(){
		System.out.println("num1 = " + num1 );
		//System.out.println("num2 = " + num2 );
		
		}
	public static void main(String[] args) {
		OuterDemo obj = new OuterDemo();
		OuterDemo.InnerDemo obj1 = obj.new InnerDemo();

	}

}

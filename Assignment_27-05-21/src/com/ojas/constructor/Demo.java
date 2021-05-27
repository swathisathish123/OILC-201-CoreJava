package com.ojas.constructor;

public class Demo  {
	
	Demo(){
		System.out.println("Default Constructor");
	}
	Demo(int num){
		this();
		System.out.println("One Parameterized Constructor");
	}
	Demo(int num1,int num2){
		this(num1);
		System.out.println("Two Parameterized Constructor");
	}
	Demo(int num1,int num2,int num3){
		this(num1,num2);
		System.out.println("Three Parameterized Constructor");
	}

	public static void main(String[] args) {
		Demo demo = new Demo(10,20,30);
		

	}

}

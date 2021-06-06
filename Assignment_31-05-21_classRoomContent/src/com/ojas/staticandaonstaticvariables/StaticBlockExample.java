package com.ojas.staticandaonstaticvariables;



public class StaticBlockExample {
	
	static int num;
	int num1;
	
	 StaticBlockExample(){
		 System.out.println("Default Constructor");
	 }
	
	static {
		System.out.println("Static block");
		num = 20;
	}
	{
		System.out.println("Non-static block");
		num1 = 30;
	}

	public static void main(String[] args) {
		
		System.out.println("welcome");
		
		 StaticBlockExample obj = new  StaticBlockExample();
		 System.out.println(obj.num1 + " " + obj.num);
		
	}

}

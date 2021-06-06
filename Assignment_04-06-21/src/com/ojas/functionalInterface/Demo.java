package com.ojas.functionalInterface;

interface ArithInterface{
	void sum(int a,int b) ;
	}
public class Demo {

	public static void main(String[] args) {
		
		ArithInterface obj = (x,y) ->{
			System.out.println("Sum =" + (x + y));
		};
		obj.sum(10, 20);
	}

}

package com.ojas.nestedClasses;

interface ArithOperation{
	
	void sum(int a,int b);
//since Jdk 1.8,Interface have dafault and static methods also	
	default void disp() {
		System.out.println("Welcome");
	}
	static void disp1() {
		System.out.println("Hi......");
	}
}
public class OuterDemo3 {

	public static void main(String[] args) {
		
		ArithOperation obj = new ArithOperation() {
			@Override
			public void sum(int a, int b) {
				System.out.println(a + b);
				}
		}; //Annonymous block 
		obj.sum(10, 20);
		obj.disp();
		ArithOperation.disp1();

	}

}

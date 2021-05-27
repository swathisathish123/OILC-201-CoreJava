package com.ojas.constructor;

class Car{
	String name;
	Car(){
		name = "Maruthi";
		System.out.println("Default Constructor");
	}
	void Car() {
		System.out.println("Welcome" + name);
	}
}
public class Example {

	public static void main(String[] args) {

     Car c = new Car();//Without calling any method also we got "Default Constructor" bcz while creating the obj only call the default constructor
     c.Car();
     

	}

}

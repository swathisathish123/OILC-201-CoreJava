package com.ojas.abstraction;

import java.util.Scanner;

interface Shape{
	
	void accept(Scanner sc);
	void call_area();
	void dispArea();
}
class Rectangle implements Shape{
	
    double length, breadth, area = 0;
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter length and breadth values");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
	}

	@Override
	public void call_area() {
		area = length * breadth;
		}

	@Override
	public void dispArea() {
		System.out.println("Area of the Rectangle :" + area);
	}
}
class Square implements Shape{
	
	double side, area = 0;
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter side value");
		side = sc.nextDouble();
	}

	@Override
	public void call_area() {
		area = side * side ;
		}

	@Override
	public void dispArea() {
		System.out.println("Area of the Square :" + area);
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape s = new Rectangle();
		s.accept(sc);
		s.call_area();
		s.dispArea();
		
		s = new Square();
		s.accept(sc);
		s.call_area();
		s.dispArea();
		
	}

}

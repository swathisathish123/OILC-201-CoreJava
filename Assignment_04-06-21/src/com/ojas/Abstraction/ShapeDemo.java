package com.ojas.Abstraction;

import java.util.Scanner;

abstract class Shape {

	abstract void getArea();

	abstract void getPerimeter();

	public void dispAreaAndPerimeter() {
		System.out.println("Area and Perimeter of diff shapes");
	}
}

class Circle extends Shape {

	private static float radius;
	static final double pi = 3.14;
	static double area;
	static double perimeter;

	public Circle() {
		System.out.println("Default constructor of Circle ");
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public  void getArea() {
		area = pi * (radius * radius);
		System.out.println("Area of Circle : " + area);
   }

	@Override
	public void getPerimeter() {
		perimeter = 2 * pi * radius;
		System.out.println("Perimeter of Circle : " + perimeter);
		
	}

	public void dispAreaAndPerimeter() {
	     getArea();
		 getPerimeter();
	}
}

class Square extends Shape {

	private float side;
	double area;
	double perimeter;

	public Square() {
		System.out.println("Default constructor of Square ");
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	void getArea() {
		area = (side * side);
		System.out.println("Area of Square : " + area);
	}

	@Override
	void getPerimeter() {
		perimeter = 4 * side;
		System.out.println("Perimeter of Rectangle : " + perimeter);
		
	}

	public void dispAreaAndPerimeter() {
		getArea();
		getPerimeter();
	}
}

class Rectangle extends Shape {

	private float length;
	private float breadth;
	double area;
	double perimeter;

	public Rectangle() {

		System.out.println("Default constructor of Rectangle ");
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void getArea() {
		area = (length * breadth);
		System.out.println("Area of Rectangle : " + area);
	}

	@Override
	void getPerimeter() {
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}

	public void dispAreaAndPerimeter() {
		
		getArea();
		getPerimeter();
	}
}

public class ShapeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value to calculate area and perimeter of circle");
		float r = sc.nextFloat();
		Shape obj = new Circle(r);
		obj.dispAreaAndPerimeter();

		System.out.println("Enter the side value to calculate area and perimeter of Square");
		float s = sc.nextFloat();
		obj = new Square(s);
		obj.dispAreaAndPerimeter();

		System.out.println("Enter the length and breadth values to calculate area and perimeter of Square");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		obj = new Rectangle(l,b);
		obj.dispAreaAndPerimeter();

	}
}

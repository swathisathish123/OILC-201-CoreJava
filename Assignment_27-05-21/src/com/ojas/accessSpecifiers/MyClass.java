package com.ojas.accessSpecifiers;


class Rectangle{
	
	private double length;
	private double breadth;
	
	public Rectangle() {
		System.out.println("Default Constructor");
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		//Area of Rectangle is A = length * width;
		double Area = length * breadth;
		return Area;
		}
	
	public double getPerimeter() {
		//The perimeter P of a rectangle is given by the formula, P=2l+2w 
		double perimeter = 2 * length + 2 * breadth;
		return perimeter;
		}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}
public class MyClass {

	public static void main(String[] args) {
		
		Rectangle obj1 = new Rectangle();
		obj1.setLength(10.21);
		obj1.setBreadth(20.23);
		obj1.getArea();
		obj1.getPerimeter();
		System.out.println(obj1.getArea());
		System.out.println(obj1.getPerimeter());
		
		System.out.println("-------------------");
		
		Rectangle obj2 = new Rectangle();
		obj2.setLength(30.21);
		obj2.setBreadth(40.23);
		System.out.println(obj2.getArea());
		System.out.println(obj2.getPerimeter());
		
		
		
	}

}

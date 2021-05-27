package com.ojas;

import java.util.Scanner;

public class Employee {
	int eno;
	String ename;
	double salary;

	void accept(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee ID no : " + eno);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj = new Employee();
		System.out.println("Enter the Employee's ID Number : ");
		int num = sc.nextInt();
		System.out.println("Enter the Employee's Name : ");
		String name = sc.next();
		System.out.println("Enter the Employee's Salary : ");
		double salary = sc.nextDouble();
		obj.accept(num, name, salary);
		obj.display();
	}

}
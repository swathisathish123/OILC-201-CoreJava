package com.ojas.Polymorphism;

import java.util.Scanner;

class Student {
	int sno;
	String sname;

	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
		System.out.println("Parameterized constructor");
	}

	protected void dispStudentDetails() {
		System.out.println("Student no :" + sno);
		System.out.println("Student name :" + sname);
	}
}

class Employee extends Student {
	double salary;
	double bonus;

	public Employee(int sno, String sname, double salary, double bonus) {
		super(sno, sname);
		this.salary = salary;
		this.bonus = bonus;
	}

	public void dispStudentDetails() {
		super.dispStudentDetails();
		System.out.println("Total Salary :" + (salary + bonus));
	}
}

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no,name,salary,double");
		Employee obj = new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
		obj.dispStudentDetails();
	}

}

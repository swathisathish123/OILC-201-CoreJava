package com.ojas.constructor;

import java.util.Scanner;

public class Student {

	int sno;
	String sname;
	protected int age;

	Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
		System.out.println("Two Parameterized Constructor");
	}

	public Student() {
		System.out.println("Default Constructor");
	}

	void dispStudent() {
		System.out.println("No :" + sno);
		System.out.println("Name :" + sname);
	}

	public static void main(String[] args) {

		/*
		 * Student s1 = new Student(10, "swathi"); s1.dispStudent(); Student s2 = new
		 * Student(20, "satti"); s2.dispStudent();
		 */

		// We want to store the 5 students of data so here i take
		// UserDefinedDatatype(Student) of int array
		Student std[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println("Enter" + " " + (i + 1) + "Student no and name");
			std[i] = new Student(sc.nextInt(), sc.next());
		}

		// To display the student info
		System.out.println("Student Info As Follows ");
		for (int i = 0; i < std.length; i++) {
			std[i].dispStudent();
		}

	}

}

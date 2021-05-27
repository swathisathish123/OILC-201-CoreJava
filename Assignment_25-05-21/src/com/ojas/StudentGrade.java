package com.ojas;

import java.util.Scanner;

public class StudentGrade {
	int sno, total;
	int smarks[] = new int[5];
	String sname;

	void accept(int sno, String sname, int smarks[]) {
		this.sno = sno;
		this.sname = sname;
		this.smarks = smarks;
	}

	void display() {
		System.out.println("Student Regd. No : " + sno);
		System.out.println("Student Name: " + sname);
		System.out.println(findGrade());
	}

	int totalMarks() {
		int sum = 0;
		for (int i = 0; i < smarks.length; i++) {
			sum += smarks[i];
		}
		return sum;
	}

	boolean isPass() {
		boolean b = false;
		int count = 0;
		for (int i = 0; i < smarks.length; i++) {
			if (smarks[i] >= 35) {
				count++;
			}
		}
		if (count == smarks.length) {
			b = true;
		}
		return b;
	}

	String findGrade() {
		String res = "";
		if (isPass()) {
			res += "Congratulation! You are Passed.\n";
			int total = totalMarks();
			res += "Total marks = " + total + "\n";
			int avg = total / smarks.length;
			res += "Average = " + avg + " \n";
			if (avg >= 75)
				res += "You have got DISTINCTION.\n";
			else if (avg >= 60)
				res += "You have got FIRST class.\n";
			else if (avg >= 50)
				res += "You have got SECOND class.\n";
			else if (avg >= 40)
				res += "You have got THIRD class.\n";
		} else
			res += "Sorry! You are failed.\n";

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentGrade obj = new StudentGrade();
		System.out.println("Enter the Student's Number, Name, 5 subject marks ");
		int num = sc.nextInt();
		System.out.println("Enter the Student's name : ");
		String name = sc.next();
		System.out.println("Enter the 5 Subject Marks : ");
		int marks[] = new int[5];
		for (int i = 0; i < 5; i++) {
			marks[i] = sc.nextInt();
		}
		obj.accept(num, name, marks);
		obj.display();

	}

}
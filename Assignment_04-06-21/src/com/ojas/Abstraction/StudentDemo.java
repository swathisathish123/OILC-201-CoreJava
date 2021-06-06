package com.ojas.Abstraction;

import java.util.Scanner;

abstract class Student {

	String studentName;
	String studentClass;
	protected static  int totalNoOfStudents ;

	public Student() {
		System.out.println("Default constructor of Student");
	}

	public Student(String studentName, String studentClass) {
        this.studentName = studentName;
		this.studentClass = studentClass;
	}

	abstract void getPercentage();

	static void getTotalNoStudents() {
		System.out.println("get Total No Of students " + totalNoOfStudents);
	}
}
class ScienceStudent extends Student{
 
	 int physicsMarks; 
	 int chemistryMarks; 
	 int  mathsMarks;
	 
	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
	    this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public void getPercentage() {
		int totalMarks = (physicsMarks + chemistryMarks + mathsMarks);
	    int percentage = (totalMarks) / 3 ;
		System.out.println("Percentage of scienceStudent" + " " + percentage);
		}
	
}
class HistoryStudent extends Student{

      int historyMarks; 
      int civicsMarks;
      
	public HistoryStudent(int historyMarks, int civicsMarks) {
	    this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	void getPercentage() {
		int totalMarks = (historyMarks + civicsMarks);
		int percentage = (totalMarks) / 2;
		System.out.println("Percentage of scienceStudent" + " " + percentage);
	}
}

public class StudentDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the science student marks");
		Student std = new ScienceStudent(sc.nextInt(),sc.nextInt(),sc.nextInt());
		std.getTotalNoStudents();
		std.getPercentage();
		
		 System.out.println("Enter the science student marks");
		 std = new HistoryStudent(sc.nextInt(),sc.nextInt());
	     std.getTotalNoStudents();
		 std.getPercentage();
		
		
	 
	}

}

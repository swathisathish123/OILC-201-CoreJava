package com.ojas.Encapsulation;

import java.util.Scanner;

class Employee {

	private int empNo;
	private String ename;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}
}

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Info");
		
		/*Employee e = new Employee();
		e.setEmpNo(sc.nextInt());
		e.setEname(sc.next());
		e.setSalary(sc.nextDouble());
		System.out.println(e.toString());
		// We want only one variable data
		System.out.println(e.getEmpNo());

		Employee e1 = new Employee();
		e1.setEmpNo(102);
		e1.setEname("swetha");
		e1.setSalary(10000.00);
		System.out.println(e1.toString());*/
		
		Employee e = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		System.out.println(e);
	}

}

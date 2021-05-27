package com.ojas.equalsAndHashCodeMethods;

import java.util.Scanner;

class Employee {
	private int empNo;
	private String ename;
	private double salary;

	public Employee(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public int hashCode() {
		return empNo;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		return this.empNo == e.empNo && this.ename.equals(e.ename) && this.salary == e.salary;
	}

	public String toString() {
		return empNo + " " + ename + " " + salary;
	}
}

public class Test {

	public static void main(String[] args) {

		Employee obj = new Employee(10, "Ramu", 30000);

		Employee obj1 = new Employee(11, "Nirmala", 30000);

		Employee obj2 = new Employee(11, "Nirmala", 30000);

		System.out.println(obj1 == obj2);
//If can't write the hashcode and equals() methods in Employee class.
//3 emp objs are occupase the 3 addresses in the heap area.But obj1 and obj2  having same content so it takes only one address, 
//For this we should write the hashcode() and equals() method (thats why here returns the true)
		System.out.println(obj1.equals(obj2));// true
		

	}

}
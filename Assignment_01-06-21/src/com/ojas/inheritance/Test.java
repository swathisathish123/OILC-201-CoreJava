package com.ojas.inheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student no,name and 3 subject marks");
		Marks obj = new Marks(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		obj.dispStudent();

	}

}

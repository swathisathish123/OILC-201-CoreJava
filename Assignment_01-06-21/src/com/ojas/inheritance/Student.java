package com.ojas.inheritance;

public class Student {

	public int sno;
	public String sname;
	
	public Student() {
		System.out.println("default constructor");
	}
    public Student(int sno, String sname) {
		this();
		this.sno = sno;
		this.sname = sname;
	}
    public void dispStudent() {
    	System.out.println("NO = " +sno +  " " + "NAME =" + sname);
    }
	
	
}

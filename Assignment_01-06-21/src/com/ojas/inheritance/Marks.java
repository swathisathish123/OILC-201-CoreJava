package com.ojas.inheritance;

public class Marks extends Student{
	
	public int m1,m2,m3;
	
	
	public Marks(int sno,String sname,int m1, int m2, int m3) {
		super(sno,sname);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
    public void dispStudent() {
    	System.out.println("NO = " +sno +  " " + "NAME =" + sname);
    	System.out.println("Student Marks : " + m1 + " " + m2 + " " + m3);
    	System.out.println(("Student Total Marks :" + totalMarks()));
    	
    }
	public int totalMarks() {
		
		return m1 + m2 + m3;
	}

}

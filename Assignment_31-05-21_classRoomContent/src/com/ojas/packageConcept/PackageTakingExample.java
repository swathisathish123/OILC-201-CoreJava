package com.ojas.packageConcept;

import java.util.Date;

public class PackageTakingExample {

	public static void main(String[] args) {
		
		Date d = new Date(); //This Date class in java.util package
		System.out.println(d);
		
		long time = System.currentTimeMillis();
		
		java.sql.Date d1 = new java.sql.Date(time); //This Date class in java.sql package

		System.out.println(d1);
		
	}

}

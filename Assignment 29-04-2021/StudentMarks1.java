package com.ojas.basicPrograms;

import java.util.Scanner;

public class StudentMarks1 {

	static float average;
	public static void main(String[] args) 
	{
		System.out.println("Enter the Marks of English, Mathematics, Physics, Chemistry & Biology respectively :\n");
		Scanner s = new Scanner(System.in);
		int eng = s.nextInt();
		int math = s.nextInt();
		int phy = s.nextInt();
		int chem = s.nextInt();
		int bio = s.nextInt();
		int total = 0;

		if (eng < 35 || math < 35 || phy < 35 || chem < 35 || bio < 35) {
			System.out.println("Sorry! You are FAILED");
		}

		
		total = eng + math + phy + chem + bio;
		System.out.println("Total marks = " + total);

		
		getAvg(total);
		s.close();
	}

	public static String getAvg(int t) 
	{
		
			average = t / 5;
		      
	        if (average >= 90)
	            return "Average marks = "+ average+"\nS grade";
	        else if(average < 90 && average >= 80)
	            return "Average marks = "+ average+"\nA grade";
	        else if(average < 80 && average >= 70)
	            return "Average marks = "+ average+"\nB grade";
	        else if(average < 70 && average >= 60)
	            return "Average marks = "+ average+"\nC grade";
	        else if(average < 60 && average >= 50)
	            return "Average marks = "+ average+"\nD grade";
	        else if(average < 50 && average >= 40)
	            return "Average marks = "+ average+"\nE grade";
	        return "Congratulations! You are PASSED";
			
		
	}

	}



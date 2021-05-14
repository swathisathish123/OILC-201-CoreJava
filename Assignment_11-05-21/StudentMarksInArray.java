package com.ojas.arrays;

import java.util.Scanner;

public class StudentMarksInArray {

	public static void main(String[] args) {

		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) { 
            System.out.print("Enter Marks of Subject " + (i + 1) +":");
            marks[i] = sc.nextInt();

           }
		dispMarks(marks);
		isPass(marks);
		int totalMarks = calTotal(marks);
		System.out.println(findGrade(totalMarks));
	
}
	   
       static void dispMarks(int marks[]){

		 System.out.println("Marks are as follows ? \n");
			for(int i = 0;i < marks.length;i++)
			{
				System.out.print(marks[i] + " ");
			}
		}
	     
	  static boolean isPass(int marks[] ){
		   //String output = "";
		  if(marks[0] >= 35 && marks[1] >= 35 && marks[2] >= 35 && marks[4] >= 35 && marks[4] >= 35 )
			  {
				System.out.println(" Congratulations! you are passed.." );
			  }
			  else
			  {
				System.out.println(" Sorry ! You are Failed...") ;
			  }
			  
		  
		return false;
	 }
	  
	  static int calTotal(int marks[]){
		   int total = 0;
		  
		  System.out.println(" \n Display total marks of student");
		  for(int i = 0;i < marks.length;i++) {
			 total = total + marks[i];
			 }
		  System.out.print(total + " ");
			return total;
	}
	 
    static  String findGrade(int total) {
		 
		 int avg =  total/5;
		
		  String result = "";
		 System.out.print(" \n The student Grade is: ");
	        if(avg >= 80)
	        {
	            result += "A";
	        }
	        else if(avg>=60 && avg<80)
	        {
	        	result += "B";
	        } 
	        else if(avg>=40 && avg<60)
	        {
	        	result += "C";
	        }
	        else
	        {
	        	result += "D";
	        }
			return result;
	    }
	  }




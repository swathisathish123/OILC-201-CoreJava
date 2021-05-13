package com.ojas.arrays;

import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values ? ");
        int array[] = new int[5];
        for(int i=0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
		}
      
       dispElementsInArray(array);
       
       System.out.print(" \n Enter the element you want to find: \n");
       int x = sc.nextInt(); 

       System.out.println(searchElementInArray(array,x));
	}
	
	static void dispElementsInArray(int arr[]) {
		System.out.println("Array Elements as follows ? \n");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
    static String searchElementInArray(int[] arr,int num) {
     
    	String res = "";
    	
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
            {

              res +=  "Element " + num + " found at " + (i + 1) + " position";
            }
         }
		return res;



		
	}

}

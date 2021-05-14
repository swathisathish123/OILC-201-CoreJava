package com.ojas.arrays;

import java.util.Scanner;

public class StackOperations {
        
	    static int stack[]  = new int[5];
		static int top = -1;
       
		static void menuDisplay()
		{
			String menu = "Menu Driven Application \n";
	        menu += " 1.Push \n";
	        menu += " 2.Pop \n";
	        menu += " 3.Display \n";
	        menu += " 4.Quit \n";
	        menu += " Select any Option ?";
	        System.out.println(menu);
		}
		
		static boolean isEmpty() {
	 		boolean b = false;
	 		if(top == -1)
	 		{
	 			b = true;
	 		}
	 		return b;
	 	}
	     static boolean isFull() {
	 		boolean b = false;
	 		if(top == stack.length - 1)
	 		{
	 			b = true;
	 		}
	 		return b;
	 	}
		
	     static void push(int ele)
	 	{
	 		if(isFull())
	 		{
	 			System.out.println("Stack is Overflow ");
	 		}
	 		else{
	 			stack[ ++ top] = ele;
	 			System.out.println("element is added ");
	 		}
	 	}
	     static void pop()
	  	{
	  		if(isEmpty())
	  		{
	  			System.out.println("Stack is empty");
	  		}
	  		else{
	  			
	           System.out.println("Deleted element is : " + stack[top]);
	           top--;
	  		}
	  	}
	     static void display()
	     {
	    	 if(isEmpty())
	    	 {
	    		 System.out.println("Stack is empty");
	    	 }
	    	 else {
	    		 System.out.println("Stack elements are as follows ");
	    		 for(int i = top;i > 0;i--)
	             {
	          	   System.out.println(stack[i]);
	             }
	    	 }
	     } 
	     static void accept()
	     {
	    	 System.out.println("Enter element to insert ?");
	     }

	     
   public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			for(;;)
			{
				menuDisplay();
				int choice = sc.nextInt();
				switch(choice)
		        {
		        case 1:
		       	     accept();
		       	     push(sc.nextInt());
		          	 break;
		        case 2:
		       	     pop();
		       	     break;
		        case 3:
	                 display();
	                 break;
		        case 4:
		             System.exit(0);
		       	     break;
		       default:
		       	System.out.println("Invalid Option");
		        }
		    }
	      
		}
   }


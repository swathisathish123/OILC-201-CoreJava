package com.ojas.arrays;

import java.util.Scanner;

public class QueueOperations {
	
	static int queue[]  = new int[5];
	static int front = 0;
	static int rear = 0;
	
	static void menuDisplay()
	{
		String menu = "Menu Driven Application \n";
        menu += " 1.Insert \n";
        menu += " 2.Delete \n";
        menu += " 3.Display \n";
        menu += " 4.Quit \n";
        menu += " Select any Option ?";
        System.out.println(menu);
	}
	
	static boolean isEmpty() {
 		boolean b = false;
 		if(front == rear)
 		{
 			b = true;
 		}
 		return b;
 	}
     static boolean isFull() {
 		boolean b = false;
 		if(rear == queue.length)
 		{
 			b = true;
 		}
 		return b;
 	}
	
     static void insert(int ele)
 	{
 		if(isFull())
 		{
 			System.out.println("Queue is full ");
 		}
 		else{
 			queue[rear ++] = ele;
 			System.out.println("element is inserted ");
 		}
 	}
     static void delete()
  	{
  		if(isEmpty())
  		{
  			System.out.println("Queue is empty");
  		}
  		else{
  			
           System.out.println("Deleted element is : " + queue[front]);
           for(int i = front;i < rear - 1;i++)
           {
        	   queue[i] = queue[i + 1];
           }
           rear --;
  		}
  	}
     static void display()
     {
    	 if(isEmpty())
    	 {
    		 System.out.println("Queue is empty");
    	 }
    	 else {
    		 System.out.println("Queue elements are as follows ");
    		 for(int i = front;i < rear ;i++)
             {
          	   System.out.println(queue[i]);
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
	       	     insert(sc.nextInt());
	          	 break;
	        case 2:
	       	     delete();
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

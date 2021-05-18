package com.ojas.arrays;

public class StackOperationsUsingArrays {

	public static void main(String[] args) {

		StackOperationsUsingArrays s = new StackOperationsUsingArrays();
		s.push(10);
		s.push(-2);
		s.push(1000); //It is top element
		s.push(1999); //It is popped from stack
		System.out.println(s.pop() + " Popped from Stack...");
		System.out.println(s.stack());
		s.peek();
		
	}
	static final int MAX = 1000;
	int top;
	int[] a = new int[MAX]; //max size of the stack
	boolean isEmpty()
	{
		return (top < 0);
	}
	int stack()
	{
		return top = -1;
	}
	boolean push(int x)
	{
		if(top >= (MAX - 1))
		{
			System.out.println("stack overflow....");
		    return false;
		}
		else
		{
			a[++top] = x;
			System.out.println(x + " pushed in to stack....");
			return true;
		}
	}
	int pop()
	{
		if(top < 0)
		{
			System.out.println(" stack underflow......");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
	}
	int peek() {
		if(top < 0)
		{
			System.out.println("stack underflow......");
			return 0;
		}
		else
		{
			int x = a[top];
			return x;
		}
	}

}

package com.ojas.abstraction;

interface SumOperation{
	void sum(int a,int b);
}
interface SubOperation extends SumOperation{
	void sub(int a,int b);
}
public class InterfaceExample implements SubOperation {

	public static void main(String[] args) {
		
		InterfaceExample obj = new InterfaceExample();
		obj.sub(100, 10);
		obj.sum(20, 10);
	}

	@Override
	public void sum(int a, int b) {
		System.out.println("SUM = " + (a + b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("SUB = " + (a - b));
		
	}

}

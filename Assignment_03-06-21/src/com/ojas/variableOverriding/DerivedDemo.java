package com.ojas.variableOverriding;

class BaseDemo{
    int a =10;
}
public class DerivedDemo extends BaseDemo{
	
	int a = 20;
	void disp() {
		System.out.println("a = " + super.a + " " + "b = " + a);
	}

	public static void main(String[] args) {
		
		DerivedDemo obj = new DerivedDemo();
		obj.disp();
	}

}

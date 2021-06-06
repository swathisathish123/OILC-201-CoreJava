package com.ojas.nestedClasses;

class Food{
	void eat() {
		System.out.println("Eat Hygenic food...");
	}
}
public class PopCorn {
	Food f = new Food() { //outer class
		void eat() {      //Inner class is not having name so it is called as Annonymous nested class
			super.eat();
			System.out.println("PopCorn is a junk food..");
		}
	};
	void disp() {
		f.eat();
	}

	public static void main(String[] args) {

		PopCorn obj = new PopCorn();
		obj.disp();

	}

}

package com.ojas.abstraction;

abstract class Animal {
//Creating Idea
	abstract void soundOfAnimal();
	void disp() {
		System.out.println("Welcome");
	}
}

class Cat extends Animal {
//Implementation of the idea
	@Override
	void soundOfAnimal() {
		System.out.println("Meoh Meoh");
	}
	}

class Dog extends Animal {
	//Implementation of the idea
		@Override
		void soundOfAnimal() {
			System.out.println("Boww Boww");
		}
	}
public class AbstractClassExample {

	public static void main(String[] args) {

		Animal a = new Cat();
		a.disp();
		a.soundOfAnimal();
		
		a = new Dog();
		a.disp();
		a.soundOfAnimal();
	}

}

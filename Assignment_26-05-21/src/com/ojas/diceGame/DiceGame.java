package com.ojas.diceGame;

import java.util.Random;
import java.util.Scanner;

class Dice {

	int faceValue;

	void roll() {

		Random r = new Random();
		faceValue = r.nextInt(6) + 1;
	}
}

class Player {

	String pname;
	int pValue;

	void accept(String pname) {
		this.pname = pname;
	}

	void throwDice(Dice d1, Dice d2) {
		d1.roll();
		d2.roll();
		pValue = d1.faceValue + d2.faceValue;
		System.out.println(pValue + "=" + d1.faceValue + "+" + d2.faceValue);
	}

}

public class DiceGame {

	public static void main(String[] args) {

		Dice d1 = new Dice();
		Dice d2 = new Dice();

		Player p1 = new Player();
		Player p2 = new Player();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter player1 name :");
		String name1 = sc.next();
		p1.accept(name1);

		System.out.println("Enter player2 name :");
		String name2 = sc.next();
		p2.accept(name2);

		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		
		String res = "";
		if (p1.pValue > p2.pValue) {
			res = p1.pname + " " + "Wins the Game ";
		} else if (p1.pValue < p2.pValue) {
			res = p2.pname + " " + "Wins the Game ";
		} else {
			res = "Both are getting same score.. Plz Try Again";
		}
		System.out.println(res);

	}

}

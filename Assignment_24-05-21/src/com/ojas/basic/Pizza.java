package com.ojas.basic;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int pizza_price = 300, discount, Amount, Final_Price;
		System.out.println(" Enter No of Pizzas you want: ");
		int num_pizza = s.nextInt();
		Amount = num_pizza * pizza_price;
		discount = ((Amount) * 20) / 100;
		Final_Price = Amount - discount;
		System.out.println("Amount:" + Amount + "\nDiscount:" + discount + "\nFinal Price:" + Final_Price);

	}

}

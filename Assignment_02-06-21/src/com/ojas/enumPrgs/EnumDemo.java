package com.ojas.enumPrgs;

enum Operations{
	ADD,SUB,MUL,DIV
}
public class EnumDemo {
	
	int firstName,secName;
	Operations op;
	
	public EnumDemo(int firstName, int secName, Operations op) {
		super();
		this.firstName = firstName;
		this.secName = secName;
		this.op = op;
	}
	
	String getOperations() {
		String res = "";
		switch (op) {
		case ADD: {
			res = "SUM ="+(firstName + secName);
			break;
		}
		case SUB: {
			res = "SUB ="+(firstName - secName);
			break;
		}
		case MUL: {
			res = "MUL ="+(firstName * secName);
			break;
		}
		case DIV: {
			res = "DIV ="+(firstName / secName);
			break;
		}
	}
		return res;
	}
	
public static void main(String[] args) {
	EnumDemo obj = new EnumDemo(34, 12,Operations.ADD);
	System.out.println(obj.getOperations());
		
	}

}

package com.ojas.encapsulation;

class Account {

	Customer customer;

	double balance;

	int accountNo;

	float interestRate;

	public Customer getCustomer() {

		return customer;

	}

	public void setCustomer(Customer customer) {

		this.customer = customer;

	}

	public double getBalance() {

		return balance;

	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public int getAccountNo() {

		return accountNo;

	}

	public void setAccountNo(int accountNo) {

		this.accountNo = accountNo;

	}

	public float getInterestRate() {

		return interestRate;

	}

	public void setInterestRate(float interestRate) {

		this.interestRate = interestRate;

	}
	

	public Account()

	{

		customer = null;

		balance = 100;

		accountNo = 0;

		interestRate = 0;

	}

	public Account(Customer customer,int accountNo, double balance, float interestRate)

	{
	    this.accountNo = accountNo;
	    this.customer =customer;
        this.balance = balance;
        this.interestRate = interestRate;

	}

	public void deposit(double amount)

	{

		double x = amount;

		balance = balance + amount;

	}

	public void withdraw(double amount)
   { 
		if (amount < balance){
           balance = balance - amount;
           }
		else{
        return;
       }

	}
	@Override
	public String toString() {
		return "Account [customer=" + customer + ", balance=" + balance + ", accountNo=" + accountNo + ", interestRate="
				+ interestRate + "]";
	}
	
	
}

class Customer {

	private String firstName;

	private String lastName;

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public Customer() {

		this.firstName = null;

		this.lastName = null;

	}

	public Customer(String firstName, String lastName) {
		this();

		this.firstName = firstName;

		this.lastName = lastName;

	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}

public class Tester {

	public static void main(String args[]) {
		
		Customer c = new Customer("swathi", "surgi");

	    Account acc = new Account(c,145678923,10000,8);
	    acc.setInterestRate(10);
	   // System.out.println(c.getFirstName()+ " " + c.getLastName() + " " + " " + acc.getBalance() + " " + acc.getInterestRate());
	    System.out.println(acc.toString());
	    acc.deposit(2000);
	    System.out.println(acc.getBalance());
	    acc.withdraw(4000);
	    System.out.println(acc.getBalance());
	    
	   
	}

}
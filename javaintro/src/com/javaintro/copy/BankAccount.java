package com.javaintro.copy;

import java.util.Scanner;

public class BankAccount {
	double balance=100000.0;
	void deposit(double amount) {
		System.out.println("Your Entered Amount is: "+amount);
		balance = balance+amount;
		checkBalance();
	}
	void withdraw(double amount) {
		System.out.println("Your Entered Amount is: "+amount);
		if(amount<=balance) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficient Balance");
		}
		checkBalance();
	}
	void checkBalance() {
		System.out.println("The current balance is: "+balance);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		ba.checkBalance();
		System.out.println("Enter the amount to be deposited: ");
		double damnt=sc.nextDouble();
		System.out.println("Enter the amount to be withdraw: ");
		double amount=sc.nextDouble();
		ba.withdraw(amount);

	}
	
}

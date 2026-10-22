package com.javaintro.copy;

public class Chocolates {

	static int chocolatecost = 15;
	static int cookiecost = 10;
	static int totalamounthaving = 450;

	static int totalcost;
	static int remainingamount;

	static void total() {

		int c = 10 * chocolatecost;
		int co = 5 * cookiecost;
		totalcost = c + co;
		remainingamount = totalamounthaving - totalcost;
		System.out.println("remaining amount after purchase :" + remainingamount);
	}

	public static void main(String[] args) {
		total();
		System.out.println("Task Completed");

	}

}
